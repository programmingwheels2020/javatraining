package com.epsilon.springbootrestunittesting.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.springbootrestunittesting.models.Book;
import com.epsilon.springbootrestunittesting.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooks(){
		List<Book> books = Arrays.asList(new Book(1, "This is my first book", "Lenin Lawrence"),
				new Book(2, "This is my second boo", "Lenin Lawrence"));
		return books;
	}
	
	public List<Book> getAllBooks(){
		return this.bookRepository.findAll();
	}
}
