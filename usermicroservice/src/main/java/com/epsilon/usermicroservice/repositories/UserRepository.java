package com.epsilon.usermicroservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsilon.usermicroservice.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	public List<User> findByEmail(String email);
}
