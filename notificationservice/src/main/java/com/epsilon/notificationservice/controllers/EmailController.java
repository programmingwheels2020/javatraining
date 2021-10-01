package com.epsilon.notificationservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.notificationservice.requests.EmailRequest;
import com.epsilon.notificationservice.responses.EmailSendResponse;

@RestController
public class EmailController {
 
	@PostMapping("/send-email")
	
	public EmailSendResponse sendEmail(@RequestBody EmailRequest eRequest) {
		System.out.println("Email Send Successfully");;
		
		return new EmailSendResponse("200","Email Send Successfully");
	}
}
