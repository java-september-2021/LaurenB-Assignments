package com.count.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer counter = (Integer) session.getAttribute("count");
			counter++;
			session.setAttribute("count", counter);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String count(HttpSession session, Model viewModel) {
		Integer currentCount = (Integer) session.getAttribute("count");
		if(currentCount == null) {
			viewModel.addAttribute("current", 0);
		} else {
			viewModel.addAttribute("current",currentCount);
		}
		return "count.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset (HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter";
	}
}
