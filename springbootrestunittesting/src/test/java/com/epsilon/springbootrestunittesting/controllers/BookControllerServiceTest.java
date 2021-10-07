package com.epsilon.springbootrestunittesting.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.epsilon.springbootrestunittesting.models.Book;
import com.epsilon.springbootrestunittesting.services.BookService;

@WebMvcTest(value = BookController.class)
class BookControllerServiceTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private BookService bookService;
	
	@Test
	void BookApi_Multiple() throws Exception {
		
		List<Book> value = new ArrayList<Book>();
		value.add(new Book(1,"ONE","Lenin"));
		value.add(new Book(2,"Two","Lenin"));
		
		when(bookService.getBooks()).thenReturn(value);
		
		RequestBuilder request = MockMvcRequestBuilders.get("/books").accept(MediaType.APPLICATION_JSON);
		
		
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{\"id\":1,\"title\":\"ONE\"},{\"id\":2,\"title\":\"Two\"}]"))
				.andReturn();
		
		System.out.println(result.getResponse().getContentAsString());
		
		
			   
	}

}
