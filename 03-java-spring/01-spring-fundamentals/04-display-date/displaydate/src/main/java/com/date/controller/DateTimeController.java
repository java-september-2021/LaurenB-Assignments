package com.date.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTimeController {
	private Date getDateTime() {
		Date now = new Date();
		return now;
	}
	@RequestMapping("/")
	public String index(Model viewModel) {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model viewModel) {
		viewModel.addAttribute("datetime",getDateTime());
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model viewModel) {
		viewModel.addAttribute("datetime", getDateTime());
		return "time.jsp";
	}
}
