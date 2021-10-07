package com.epsilon.springbootrestunittesting.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@WebMvcTest(value = BookController.class)
class BookControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void BookApi_Basic() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/book").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"title\":\"This is new Book\"}"))
				.andReturn();
			   
	}
	
	@Test
	void BookApi_Multiple() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/books").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{\"id\":1},{\"id\":2}]"))
				//.andExpect(content().json())
				.andReturn();
		
		
			   
	}

}
