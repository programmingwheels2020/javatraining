package com.epsilon.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.epsilon.mockitodemo.service.DataService;



@ExtendWith(MockitoExtension.class)
class CalculateBusinessStubTest {
	
	
	@InjectMocks
	CalculateBusiness cb;
	
	
	@Mock
	DataService dataServiceMock;
	
	

	@Test
	void CalculateAddTest_basic() {
		
		when(dataServiceMock.getData()).thenReturn(new int[] {1,2,3,4,5,6});
		
	    int actual = cb.sum();
		int expected = 21;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_empty() {
		
		
	    when(dataServiceMock.getData()).thenReturn(new int[] {});
		
	    int actual = cb.sum();
		int expected = 0;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void CalculateAddTest_once() {
		
		when(dataServiceMock.getData()).thenReturn(new int[] {2});
		
	    int actual = cb.sum();
		int expected = 2;
		
		assertEquals(expected, actual);
		
	}
	
	
	
	
}
