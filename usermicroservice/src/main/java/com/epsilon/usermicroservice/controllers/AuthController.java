package com.epsilon.usermicroservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.usermicroservice.model.User;
import com.epsilon.usermicroservice.services.NotificationService;
import com.epsilon.usermicroservice.services.UserService;

@RestController
public class AuthController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private NotificationService nService;
	
	
	@PostMapping(path = "/register")
	public void Register(@RequestBody User user) throws Exception {
		List<User> existingUsers = this.userService.getUserByEmail(user.getEmail());
		
		if(existingUsers == null || existingUsers.size()>0) {
			throw new Exception("User with same email Exists");
		}
		
		this.userService.saveUser(user);
		
		this.nService.sendEmail(user.getEmail(), "WELCOME_EMAIL");
		
	}
}
