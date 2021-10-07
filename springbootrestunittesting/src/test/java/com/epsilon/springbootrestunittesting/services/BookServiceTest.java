package com.epsilon.springbootrestunittesting.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.epsilon.springbootrestunittesting.models.Book;

class BookServiceTest {

	@Test
	void getBookServiceTest_Basic() {
		BookService bService = new BookService();
		List<Book> books = bService.getBooks();
		List<Book> expectedBooks = Arrays.asList(new Book(1, "This is my first book", "Lenin Lawrence"),
				new Book(2, "This is my second boo", "Lenin Lawrence"));
		
		assertEquals(expectedBooks, books);
		
	}

}
