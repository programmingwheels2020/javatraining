package com.epsilon.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Distributor {
	
	@Value("XYZ Distributor")
	String name;
	
	@Value("Hyderabad")
	String city;
	
	@Value("783748")
	String registrationNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		this.city = city;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public String toString() {
		return "Distributor [name=" + name + ", city=" + city + ", registrationNumber=" + registrationNumber + "]";
	}

}
