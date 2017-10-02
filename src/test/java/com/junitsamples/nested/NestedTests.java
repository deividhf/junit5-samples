package com.junitsamples.nested;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.PrivateCar;

public class NestedTests {

	@Test
	public void testAll() {
		PrivateCar privateCar = PrivateCar.of("Civic", "MLL-2222");
		
		assertAll("Private Car asserts", 
			() -> assertEquals("Civic", privateCar.getModel()),
			() -> assertEquals("MLL-2222", privateCar.getPlate())
		);
	}
	
	@Nested
	@DisplayName("Nested tests")
	class NestedTestsExample {
		
		@Test
		public void testCallUber() {
			PrivateCar privateCar = PrivateCar.of("Civic", "MLL-2222");
			PrivateCar calledPrivateCar = privateCar.call();
			assertFalse(calledPrivateCar.isAvailable());
		}
		
	}
}
