package com.lookify.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.lookify.models.Song;
import com.lookify.services.SongService;

@Controller
public class SongControllers {
	private SongService sService;
	public SongControllers(SongService service) {
		this.sService = service;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String Songs(Model viewModel, @ModelAttribute("song")Song song) {
		viewModel.addAttribute("allSongs", sService.allSongs());
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String add(@ModelAttribute("song")Song song) {
		return "new.jsp";
	}
	
	@PostMapping("/songs/new")
	public String addSong(@Valid @ModelAttribute("song")Song song, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("songs", this.sService.allSongs());
			return "new.jsp";
		}
		this.sService.createSong(song);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/songs/{id}")
	public String showSong(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("song", this.sService.findSong(id));
		return "Show.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteOne(@PathVariable("id") Long id) {
		sService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/search/topTen")
	public String topTen(Model viewModel) {
		viewModel.addAttribute("allSongs", sService.topTenRating());
		return "topTen.jsp";
	}
	
	@GetMapping("/search/artist")
	public String artistSearch( @RequestParam(value="artist", required= false) String artist, Model viewModel) {
		if (artist.length() < 5) {
			viewModel.addAttribute("errors", "Artist must be more than 5 characters");
			viewModel.addAttribute("allSongs", sService.allSongs());
			return "dashboard.jsp";
		}
		List<Song> allSongs = sService.findByArtist(artist);
		viewModel.addAttribute("allSongs", sService.findByArtist(artist));
		return "search.jsp";
	}
}
