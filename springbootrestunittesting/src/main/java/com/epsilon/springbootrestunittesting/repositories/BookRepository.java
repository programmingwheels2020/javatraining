package com.epsilon.springbootrestunittesting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epsilon.springbootrestunittesting.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
