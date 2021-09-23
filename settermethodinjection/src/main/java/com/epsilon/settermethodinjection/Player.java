package com.epsilon.settermethodinjection;

import java.util.List;
import java.util.Map;

public class Player {
	String name;
	int rating;
	String position;
	String country;

	Club club;

	List<Club> previousClubs;

	Map<String, Integer> skills;

	public Map<String, Integer> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, Integer> skills) {
		this.skills = skills;
	}

	public List<Club> getPreviousClubs() {
		return previousClubs;
	}

	public void setPreviousClubs(List<Club> previousClubs) {
		this.previousClubs = previousClubs;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

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
		return "Player [name=" + name + ", rating=" + rating + ", position=" + position + ", country=" + country
				+ ", club=" + club + ", previousClubs=" + previousClubs + ", skills=" + skills + "]";
	}

}
