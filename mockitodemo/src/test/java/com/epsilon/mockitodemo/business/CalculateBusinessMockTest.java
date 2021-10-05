package com.epsilon.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.epsilon.mockitodemo.service.DataService;


class DataServiceBasicImpl implements DataService{

	@Override
	public int[] getData() {
		
		return new int[] {1,2,3,4,5,6};
	}
	
}


class DataServiceEmptyImpl implements DataService{

	@Override
	public int[] getData() {
		
		return new int[] {};
	}
	
}


class DataServiceOnceImpl implements DataService{

	@Override
	public int[] getData() {
		
		return new int[] {2};
	}
	
}

class CalculateBusinessMockTest {

	@Test
	void CalculateAddTest_basic() {
		
		CalculateBusiness cb = new CalculateBusiness();
		cb.setDataService(new DataServiceBasicImpl());
		
		int actual = cb.sum();
		int expected = 21;
		
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void CalculateAddTest_empty() {
		
		CalculateBusiness cb = new CalculateBusiness();
		cb.setDataService(new DataServiceEmptyImpl());
		
		int actual = cb.sum();
		int expected = 0;
		
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void CalculateAddTest_One() {
		
		CalculateBusiness cb = new CalculateBusiness();
		cb.setDataService(new DataServiceOnceImpl());
		
		int actual = cb.sum();
		int expected = 2;
		
		assertEquals(expected, actual);
		
		
	}
	
	
}
