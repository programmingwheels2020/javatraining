package com.epsilon.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
@Scope("singleton")
public class Book {

	@Value("My Autobiography")
	String title;
	
	@Value("Lenin Lawrence")
	String author;
	
	@Autowired(required = false)
	@Qualifier("publisher")
	Publisher publisher;

	
	public Book() {
		super();
	}

	public Book(String title, String author, Publisher publisher1) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher1;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	

	
	public void init() {
		System.out.println("Bean Initialized");
	}
	
	public void stop() {
		System.out.println("Bean is destroyed");
	}

}
