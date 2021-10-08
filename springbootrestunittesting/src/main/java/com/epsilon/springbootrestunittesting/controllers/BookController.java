package com.epsilon.springbootrestunittesting.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.springbootrestunittesting.models.Book;
import com.epsilon.springbootrestunittesting.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public Book getBook() {
		return new Book(1, "This is new Book", "Lenin Lawrence");
	}

	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getBooks();
	}
	
	@GetMapping("/get-all-books")
	public List<Book> getAllBooks(){
		return this.bookService.getAllBooks();
	}
}
