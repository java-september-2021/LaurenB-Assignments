package com.updateDelete.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.updateDelete.mvc.models.Book;
import com.updateDelete.mvc.services.BookService;

@RestController
public class BooksApi {
	private BookService bookService;
	
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/api/books")
	public List<Book> index() {
		return this.bookService.allBooks();
	}
	
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language")String lang, @RequestParam(value="pages")Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}
	
	@GetMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book=bookService.findBook(id);
		return book;
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		bookService.delete(id);
	}
	
	@PutMapping("/edit/{id}")
	public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages")int numOfPages){
		Book updateBook = bookService.findBook(id);
				updateBook.setTitle(title);
				updateBook.setDescription(desc);
				updateBook.setLanguage(lang);
				updateBook.setNumberOfPages(numOfPages);
				bookService.update(updateBook);
		return updateBook;
	}
}
