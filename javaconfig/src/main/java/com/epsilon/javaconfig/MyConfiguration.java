package com.epsilon.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {
   
	/*
	@Bean
	public Distributor getDistributor() {
		Distributor dist =  new Distributor();
		dist.setCity("Delhi");
		dist.setName("XYZ Distributor");
		dist.setRegistrationNumber("3456");
		return dist;
	}*/
	
	@Bean
	public Movie getMovie() {
		Movie movie = new Movie();
		movie.setTitle("KGF");
		movie.setDirector("KGF Director");
		movie.setImdbrating(8);
		return movie;
	}
}
