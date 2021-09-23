package com.epsilon.autowiringdemo;

public class Location {
	String city;
	String country;

	public Location() {
		super();
	}

	public Location(String city) {
		super();
		this.city = city;
	}

	public Location(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + "]";
	}

}
