package com.epsilon.settermethodinjection;

public class Player {
	String name;
	int rating;
	String position;
	String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", rating=" + rating + ", position=" + position + ", country=" + country + "]";
	}

}
