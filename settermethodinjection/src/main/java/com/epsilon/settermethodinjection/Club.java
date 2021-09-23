package com.epsilon.settermethodinjection;

public class Club {
	String name;
	String country;
	String leagueName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", country=" + country + ", leagueName=" + leagueName + "]";
	}

}
