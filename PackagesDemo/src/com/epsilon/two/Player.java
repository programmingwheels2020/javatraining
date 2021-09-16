package com.epsilon.two;

public class Player {
	String name;
	String position;
	String rating;

	public String getName() {
		return name;
	}

	public Player(String name, String position, String rating) {
		super();
		this.name = name;
		this.position = position;
		this.rating = rating;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
}
