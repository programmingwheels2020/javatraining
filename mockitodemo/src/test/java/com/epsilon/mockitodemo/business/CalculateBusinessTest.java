package com.epsilon.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateBusinessTest {

	@Test
	void CalculateAddTest_basic() {
		
		int[] data = new int[] {1,2,3,4,5};
		
		CalculateBusiness cb = new CalculateBusiness();
		
		int actual = cb.add(data);
		
		int expected=15;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_empty() {
		
		int[] data = new int[] {};
		
		CalculateBusiness cb = new CalculateBusiness();
		
		int actual = cb.add(data);
		
		int expected=0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_one() {
		
		int[] data = new int[] {2};
		
		CalculateBusiness cb = new CalculateBusiness();
		
		int actual = cb.add(data);
		
		int expected=2;
		
		assertEquals(expected, actual);
		
	}

}
