package com.epsilon.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.epsilon.mockitodemo.service.DataService;



class CalculateBusinessStubTest {
	
	CalculateBusiness cb = new CalculateBusiness();
	
	DataService dataServiceMock =  mock(DataService.class);
	
	

	@Test
	void CalculateAddTest_basic() {
		
		when(dataServiceMock.getData()).thenReturn(new int[] {1,2,3,4,5,6});
		
	    cb.setDataService(dataServiceMock);
	    
	    int actual = cb.sum();
		int expected = 21;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_empty() {
		
		
	    when(dataServiceMock.getData()).thenReturn(new int[] {});
		
	    cb.setDataService(dataServiceMock);
	    
	    int actual = cb.sum();
		int expected = 0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_once() {
		
		when(dataServiceMock.getData()).thenReturn(new int[] {2});
		
	    cb.setDataService(dataServiceMock);
	    
	    int actual = cb.sum();
		int expected = 2;
		
		assertEquals(expected, actual);
		
	}
	
	
	
	
}
