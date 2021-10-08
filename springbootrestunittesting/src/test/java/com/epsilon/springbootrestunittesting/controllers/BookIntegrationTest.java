package com.epsilon.springbootrestunittesting.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.epsilon.springbootrestunittesting.models.Book;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BookIntegrationTest {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getAllBooksApiTest() throws JSONException {
		 String url = "/get-all-books";
		 String response = this.restTemplate.getForObject(url, String.class);
		 System.out.println(response);
		 
		 JSONAssert.assertEquals("[{id:1},{id:2}]", response, false);
	}

}
