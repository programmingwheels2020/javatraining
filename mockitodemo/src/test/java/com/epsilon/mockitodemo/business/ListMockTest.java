package com.epsilon.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class ListMockTest {

	List<String> strMock = mock(List.class);

	@Test
	void size_basic() {
		when(strMock.size()).thenReturn(5);

		assertEquals(5, strMock.size());
	}

	@Test
	void return_multiple_values() {
		when(strMock.size()).thenReturn(5).thenReturn(10);

		assertEquals(5, strMock.size());
		assertEquals(10, strMock.size());
	}

	@Test
	void return_paameters() {
		when(strMock.get(0)).thenReturn("Lenin Lawrence");

		assertEquals("Lenin Lawrence", strMock.get(0));
		assertEquals(null, strMock.get(1));
		// assertEquals(10, strMock.size());
	}

	@Test
	void return_with_Generic_parameter() {
		when(strMock.get(anyInt())).thenReturn("Lenin Lawrence");

		assertEquals("Lenin Lawrence", strMock.get(0));
		assertEquals("Lenin Lawrence", strMock.get(1));
		// assertEquals(10, strMock.size());
	}

	@Test
	void verificationFunctionCall() {
		String value1 = strMock.get(0);
		String value2 = strMock.get(1);

		verify(strMock, times(2)).get(anyInt());
		verify(strMock, atLeast(1)).get(anyInt());
		verify(strMock, atMost(2)).get(anyInt());

		// verify(strMock,never()).get(anyInt());

	}

	@Test
	void arguementCaptoring() {
		strMock.add("Whatever");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

		verify(strMock).add(captor.capture());

		System.out.println(captor.getValue());

		assertEquals("Whatever", captor.getValue());

	}

	@Test
	void arguementCaptoringMultipleTime() {
		strMock.add("Whatever");
		strMock.add("Whatever1");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

		verify(strMock,times(2)).add(captor.capture());

		List<String> values = captor.getAllValues();
		assertEquals("Whatever", values.get(0));
		assertEquals("Whatever1", values.get(1));

	}
}
