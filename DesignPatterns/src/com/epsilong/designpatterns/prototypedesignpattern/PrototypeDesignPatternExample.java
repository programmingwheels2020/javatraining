package com.epsilong.designpatterns.prototypedesignpattern;

public class PrototypeDesignPatternExample {

	public static void main(String[] args) {
		EmployeeRecord e1 = new EmployeeRecord(101, "Lenin Lawrence", "SE", 11111.00, "Kochin");
		
		e1.showRecord();
		System.out.println(e1.hashCode());
		
		EmployeeRecord e2 = (EmployeeRecord)e1.getClone();
		
		System.out.println(e2.hashCode());
		e2.setName("Lawrence Francis");
		e2.showRecord();
		
		
	}
}
