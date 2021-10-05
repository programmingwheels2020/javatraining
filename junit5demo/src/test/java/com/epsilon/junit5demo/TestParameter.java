package com.epsilon.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestParameter {

	@ParameterizedTest
	@ValueSource(strings = {"LENIN","LAWRENCE","KERALA","INDIA"})
	void test(String str) {
		
		assertTrue(str.length()>0);
	}
	
	
	@RepeatedTest(3)
	void test_repeated() {
		assertTrue(2<3);
	}
	
	@Nested
	class NestTest{
		
		@Test
		void test_nested_one() {
			assertTrue(2<3);
		}
		@Test
		void test_nested_two() {
			assertTrue(2<3);
		}
		
		@Test
		void test_nested_thre() {
			assertTrue(2<3);
		}
	}

}
