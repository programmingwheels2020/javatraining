package com.epsilon.constructorinjection;

import java.util.List;
import java.util.Map;

public class Player {

	String name;
	int rating;
	String country;

	Club club;

	List<Club> previousClubs;

	Map<String, Integer> skills;

	

	public Player(String name, int rating, String country, Club club, List<Club> previousClubs,
			Map<String, Integer> skills) {
		super();
		this.name = name;
		this.rating = rating;
		this.country = country;
		this.club = club;
		this.previousClubs = previousClubs;
		this.skills = skills;
	}



	@Override
	public String toString() {
		return "Player [name=" + name + ", rating=" + rating + ", country=" + country + ", club=" + club
				+ ", previousClubs=" + previousClubs + ", skills=" + skills + "]";
	}

}
