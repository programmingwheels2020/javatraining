package com.epsilon;

import com.epsilon.controller.Person;

public class Student extends Person{

	public Student(String name, int age, String location) {
		super(name, age, location);
		
		
	}
	
    protected int getStudentAge() {
    	return this.getAge();
    }
	
	protected void getDetailsStudent() {
		System.out.println("Test");
	}
	
	

}
