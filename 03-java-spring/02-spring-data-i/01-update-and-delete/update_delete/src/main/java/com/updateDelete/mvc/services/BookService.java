package com.updateDelete.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.updateDelete.mvc.models.Book;
import com.updateDelete.mvc.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepository = bookRepo;
	}
	
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
		
	}
	public Book findBook(Long id) {
		return this.bookRepository.findById(id).orElse(null);
		
	}
	
	public Book update(Book book) {
		return this.bookRepository.save(book);
	}
	
	public void delete(Long id) {
		this.bookRepository.deleteById(id);
	}
}
