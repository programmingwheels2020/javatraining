package com.epsilon;

import com.epsilon.controller.Person;

public class Epsilon {

	public static void main(String[] args) {
		
		Person p = new Person("Lenin", 33, "Banglore");
		
		//p.getDetails();
		
		System.out.println(p.name);
		
		Student st = new Student("Lenin", 33, "Banglore");
		st.getDetailsStudent();
		
		//int age = st.getStudentAge();
		
		
		

	}

}
