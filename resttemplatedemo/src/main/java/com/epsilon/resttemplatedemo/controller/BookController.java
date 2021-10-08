package com.epsilon.resttemplatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.epsilon.resttemplatedemo.models.Book;

@RestController
public class BookController {

	@Autowired
	RestTemplate restTemplate;
	
	private final String URL= "https://615425f02473940017efac40.mockapi.io/books";
	
	@GetMapping("/books")
	public Book[] getAllBooks() {
		
	  Book[] books = this.restTemplate.getForObject(URL, Book[].class);
	  
	  return books;
		
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book bookRequest) {
		/*Book bookRequest = new Book();
		bookRequest.setTitle("My Autobiography");
		bookRequest.setAuthor("Lenin Lawrence");
		bookRequest.setLanguage("English");
		bookRequest.setBookCoverPhoto("https://lenin.lawrence.com/photo");
		bookRequest.setPrice(57.00);*/
		
		return this.restTemplate.postForObject(URL, bookRequest, Book.class);
	}
}
