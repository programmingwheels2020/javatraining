package com.epsilon.idrefdemo;

public class Location {
	public String city;
	public String country;

	public Location(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + "]";
	}

}
