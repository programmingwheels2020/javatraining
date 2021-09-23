package com.epsilon.idrefdemo;

public class Employee {

	public String name;
	public Location location;

	public Employee(String name, Location location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + "]";
	}

}
