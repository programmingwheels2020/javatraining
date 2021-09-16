package com.epsilon.controller;

public class Person {

	public String name;
	protected int age;
	String location;

	public Person(String name, int age, String location) {

		this.name = name;
		this.age = age;
		this.location = location;
	}
    
	public void getDetails() {
		System.out.println("Name is "+this.name+" age is "+this.age+" and location is "+this.location);
	}
	
	protected int getAge() {
		return this.age;
	}
}
