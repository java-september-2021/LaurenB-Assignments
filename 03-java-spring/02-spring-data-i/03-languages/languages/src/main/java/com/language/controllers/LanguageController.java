package com.language.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.language.models.Language;
import com.language.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lService;
	public LanguageController(LanguageService service) {
		this.lService = service;
	}
	
	@GetMapping("/")
	public String index(Model viewModel, @ModelAttribute("language") Language language) {
		viewModel.addAttribute("allLanguages", this.lService.allLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage (@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allLanguages", this.lService.allLanguages());
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String showLanguage(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("thisLang", this.lService.findLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editLanguage(@ModelAttribute("language") Language language, Model viewModel, @PathVariable("id")Long id) {
		viewModel.addAttribute("language", this.lService.findLanguage(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String updateLanguage (@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		System.out.println(id);
		System.out.println(result.hasErrors());
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.findLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(language);
		return"redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		lService.delete(id);
		return"redirect:/";
	}
}
