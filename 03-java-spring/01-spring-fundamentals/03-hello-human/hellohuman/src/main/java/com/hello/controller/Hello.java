package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {
	@RequestMapping("/")
	public String index(Model viewModel, @RequestParam(value="name", required=false, defaultValue="Human")String name) {
		viewModel.addAttribute("name", name);
		return "index.jsp";
	}
}
