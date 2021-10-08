package com.epsilong.designpatterns.singletondesingpatterns;




public class SingletonPatternExample {

	public static void main(String[] args) {
		
		Captain cap = Captain.getCaptain();
		
		System.out.println(cap.hashCode());
		
		Captain cap1 = Captain.getCaptain();
		
		System.out.println(cap1.hashCode());

	}

}
