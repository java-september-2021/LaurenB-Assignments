package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/code")
	public String code(@RequestParam("input") String input, RedirectAttributes redirectAttributes) {
		if(input.equals("bushido")) {
			return"code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	
	}
}
