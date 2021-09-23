package com.epsilon.constructorinjection;

public class Club {

	String name;
	String country;
	String leagueName;

	public Club(String name, String country, String leagueName) {
		super();
		this.name = name;
		this.country = country;
		this.leagueName = leagueName;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", country=" + country + ", leagueName=" + leagueName + "]";
	}

}
