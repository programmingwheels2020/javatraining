package com.epsilon.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	void testAdd_Basic() {
		Calculate calculate = new Calculate();
		int[] data = new int[] {3,6,9,12,15,18};
		
		int actualSum = calculate.add(data);
		
		int expectedResult = 63;
		
		assertEquals(expectedResult, actualSum);
		
	}
	
	@Test
	void testAdd_Empty() {
		Calculate calculate = new Calculate();
		int[] data = new int[] {};
		
		int actualSum = calculate.add(data);
		
		int expectedResult = 0;
		
		assertEquals(expectedResult, actualSum);
		
	}
	
	@Test
	void testAdd_One() {
		Calculate calculate = new Calculate();
		int[] data = new int[] {5};
		
		int actualSum = calculate.add(data);
		
		int expectedResult = 5;
		
		assertEquals(expectedResult, actualSum);
		
	}

}
