package com.epsilon.usermicroservice.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.usermicroservice.model.User;
import com.epsilon.usermicroservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		user.setId(UUID.randomUUID().toString());
		this.userRepository.save(user);
		
	}
	
	public List<User> getUserByEmail(String email){
		return this.userRepository.findByEmail(email);
	}
}
