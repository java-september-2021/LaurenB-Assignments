package com.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lookify.models.Song;
import com.lookify.repositories.SongRepository;

@Service
public class SongService {
	private SongRepository sRepo;
	
	public SongService(SongRepository repo) {
		this.sRepo = repo;
	}
	
	// Find all Songs
	public List<Song> allSongs(){
		return sRepo.findAll();
	}
	
	// add new song
	public Song createSong(Song newSong) {
		return this.sRepo.save(newSong);
	}
	
	// find a song
	public Song findSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	// find by top 10 songs
	public List<Song> topTenRating(){
		return sRepo.findTop10ByOrderByRatingDesc();
	}
	
	// find by artist
	public List<Song> findByArtist(String artist){
		return sRepo.findByArtistContaining(artist);
	}
	
	// update song
	public Song updateSong(Song updateSong) {
		return sRepo.save(updateSong);
	}
	
	// delete song
	public String deleteSong(Long id) {
		sRepo.deleteById(id);
		return "Song has been deleted";
	}
}
