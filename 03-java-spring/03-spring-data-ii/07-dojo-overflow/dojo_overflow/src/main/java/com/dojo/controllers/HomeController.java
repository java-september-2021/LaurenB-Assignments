package com.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.models.Answer;
import com.dojo.models.Question;
import com.dojo.services.AppService;
import com.dojo.validators.TagValidator;

@Controller
public class HomeController {
	@Autowired
	private AppService aService;
	@Autowired
	private TagValidator validator;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("allquestions",this.aService.getAllQuestions());
		return "dashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question")Question question) {
		return "new.jsp";
	}
	
	@PostMapping("/newQuestion")
		public String addQuestion(@Valid @ModelAttribute("question")Question question, BindingResult result ) {
			validator.validate(question, result);
			if(result.hasErrors()) {
				return "new.jsp";
			}
			this.aService.createQuestion(question);
			return "redirect:/";
	}
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("answer")Answer answer) {
		viewModel.addAttribute("question", this.aService.findOneQuestion(id));
		return "show.jsp";
	}
	
	@PostMapping("/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("answer")Answer answer, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("question", this.aService.findOneQuestion(answer.getQuestion().getId()));
			return "show.jsp";
		}
		this.aService.createAnswer(answer);
		return "redirect:/show/" + answer.getQuestion().getId();
	}
}
