package com.show.controllers;


import java.util.List;

import javax.validation.Valid;

import com.show.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.show.services.ShowService;

@Controller
public class ShowController {
	@Autowired
	private ShowService showService;
	
	@GetMapping("/books")
	public String index(Model viewModel) {
		List<Book> books= showService.allBooks();
		viewModel.addAttribute("books", books);
		return "books.jsp";
	}
	
	@GetMapping("/books/{index}")
	public String findBookbyIndex(Model viewModel, @PathVariable("index")Long id) {
		Book book = showService.findBook(id);
		viewModel.addAttribute("book", book);
		return "showBook.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books")
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			showService.createBook(book);
			return "redirect:/books";
		}
	}
}
