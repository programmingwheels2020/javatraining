package com.epsilon.usermicroservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epsilon.usermicroservice.requests.EmailRequest;

@Service
public class NotificationService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String URL = "http://localhost:8080/send-email";
	
	public void sendEmail(String emailId, String emailType) {
		
		EmailRequest request = new EmailRequest();
		request.setEmailId(emailId);
		request.setEmailType(emailType);
		
		this.restTemplate.postForObject(URL, request, Object.class);
	}
}
