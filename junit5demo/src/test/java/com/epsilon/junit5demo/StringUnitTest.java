package com.epsilon.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.time.*;

class StringUnitTest {

	@Test
	void string_test_one() {
		
		char[] expected = {'L','E','N','I','N'};
		
		char[] actual = "LENIN".toCharArray();
		
		assertArrayEquals(expected, actual);
		
		String[] strActual = "INDIA IS MY COUNTRY".split(" ");
		
		String[] strExpected =  {"INDIA","IS","MY","COUNTRY"};
		
		assertArrayEquals(strExpected, strActual);
		
		
		
	}
	
	@Test
	void string_test_two() {
		assertTrue(5>4);
		
		assertFalse(5<4);
	}
	
	@Test
	void string_test_three() {
		
		String str = null;
		
		assertNull(str);
	}
	
	@Test
	void string_test_four() {
		String str = null;
		
		assertThrows(NullPointerException.class, ()->{
			str.length();
		});
	}
	
	@Test
	void string_test_five() {
		assertTimeout(Duration.ofMillis(200), ()->{
			for(int i=0;i<10000;i++) {
				System.out.println(i);
			}
		});
	}
	
	@Test
	void string_test_six() {
		assertAll(()->{
			assertEquals(5,5);
		},()->{
			assertTrue(5>4);
		});
	}
	
	

}
