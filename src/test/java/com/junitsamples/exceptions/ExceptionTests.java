package com.junitsamples.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.Uber;

public class ExceptionTests {

	@Test
	@DisplayName("Testing null")
	public void assertThrowsTest() {
		assertThrows(NullPointerException.class, () -> Uber.of(null, "MLU-233"));
	}

	@Test
	@DisplayName("😱")
	public void assertThrowsCatchingException() {
		NullPointerException exception = assertThrows(NullPointerException.class, () -> { 
			Uber.of(null, "MLU-233");
		});
		assertEquals("Model can't be null.", exception.getMessage());
	}

}
