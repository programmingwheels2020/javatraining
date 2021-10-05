package com.epsilon.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.Timeout;
import java.time.*;

@Tag("Production")
class StringUnitTest {

	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All ");
	}
	
	@BeforeEach
	public void beforeEach(TestInfo testInfo) {
		System.out.println("Before Each "+ testInfo.getDisplayName());
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@Test
	@DisplayName("This is test for String one")
	void string_test_one() {
		
		char[] expected = {'L','E','N','I','N'};
		
		char[] actual = "LENIN".toCharArray();
		
		assertArrayEquals(expected, actual);
		
		String[] strActual = "INDIA IS MY COUNTRY".split(" ");
		
		String[] strExpected =  {"INDIA","IS","MY","COUNTRY"};
		
		assertArrayEquals(strExpected, strActual);
		
		
		
	}
	
	@Test
	@DisplayName("This is test for String two")
	void string_test_two() {
		assertTrue(5>4);
		
		assertFalse(5<4);
	}
	
	@Test
	@DisplayName("This is test for String three")
	void string_test_three() {
		
		String str = null;
		
		assertNull(str);
	}
	
	@Test
	@DisplayName("This is test for String four")
	void string_test_four() {
		String str = null;
		
		assertThrows(NullPointerException.class, ()->{
			str.length();
		});
	}
	
	@Test
	@DisplayName("This is test for String Five")
	void string_test_five() {
		assertTimeout(Duration.ofMillis(200), ()->{
			for(int i=0;i<10000;i++) {
				//System.out.println(i);
			}
		});
	}
	
	@Test
	@DisplayName("This is test for String sex")
	void string_test_six() {
		assertAll(()->{
			assertEquals(5,5);
		},()->{
			assertTrue(5>4);
		});
	}
	
	

}
