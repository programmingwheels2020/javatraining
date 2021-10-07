package com.epsilon.springbootrestunittesting.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@WebMvcTest(value = WelcomeController.class)
class WelcomeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void Welcome_Basic() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders.get("/welcome").accept(MediaType.APPLICATION_JSON);
		
	   MvcResult result=	mockMvc.perform(request)
			                   .andExpectAll(status().isOk())
			                   //.andExpect(content().toString())
			                   .andReturn();
			                  
	   
	   System.out.println(result.getResponse().getStatus());
	   
	   assertEquals("Welcome", result.getResponse().getContentAsString());
	}

}
