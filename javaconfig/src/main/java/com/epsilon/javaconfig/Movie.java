package com.epsilon.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

	String title;
	String director;
	int imdbrating;
	
	@Autowired(required = false)
	Distributor distributor;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getImdbrating() {
		return imdbrating;
	}
	public void setImdbrating(int imdbrating) {
		this.imdbrating = imdbrating;
	}
	public Distributor getDistributor() {
		return distributor;
	}
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", imdbrating=" + imdbrating + ", distributor="
				+ distributor + "]";
	}
	
	
	

}
