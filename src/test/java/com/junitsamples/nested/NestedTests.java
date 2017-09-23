package com.junitsamples.nested;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.Uber;

public class NestedTests {

	@Test
	public void testAll() {
		Uber uber = Uber.of("Civic", "MLL-2222");
		
		assertAll("Uber asserts", 
			() -> assertEquals("Civic", uber.getModel()),
			() -> assertEquals("MLL-2222", uber.getPlate())
		);
	}
	
	@Nested
	@DisplayName("Nested tests")
	class NestedTestsExample {
		
		@Test
		public void testCallUber() {
			Uber uber = Uber.of("Civic", "MLL-2222");
			Uber calledUber = uber.call();
			assertFalse(calledUber.isAvailable());
		}
		
	}
}
