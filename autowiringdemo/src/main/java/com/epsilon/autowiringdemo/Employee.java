package com.epsilon.autowiringdemo;

public class Employee {
	String name;
	Location location;

	public void start() throws Exception{
		System.out.println("Employee bean Initialized");
	}
	
	public void destroy() throws Exception{
		System.out.println("Employee bean destroyed");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + "]";
	}

}
