package com.epsilon.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootdemoApplication.class, args);
		
	}
	
	

}
