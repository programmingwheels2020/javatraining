package com.epsilon.springbootrestunittesting.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		
		ResponseEntity<String> resp = new ResponseEntity<String>("Welcome", null, 200);

		return resp;
	}
}
