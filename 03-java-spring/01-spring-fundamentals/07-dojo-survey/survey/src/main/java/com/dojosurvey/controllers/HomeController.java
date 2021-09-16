package com.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/") 
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/survey")
	public String survery(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel ) {
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language", language);
		viewModel.addAttribute("comment", comment);
		return"survey.jsp";
	}
}
