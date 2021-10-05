package com.epsilon.junit5demo;

public class Calculate {
	
	public int add(int[] data) {
		int sum=0;
		for (int a : data ) {
			sum+=a;
		}
		return sum;
	}

}
