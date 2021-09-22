package com.show.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.show.models.Book;
import com.show.repositories.ShowRepository;

@Service
public class ShowService {
	@Autowired
	private ShowRepository showRepository;
	
	public List<Book> allBooks(){
		return showRepository.findAll();
	}
	
	public Book createBook(Book b) {
		return showRepository.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = showRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
}
