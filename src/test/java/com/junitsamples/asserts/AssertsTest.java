package com.junitsamples.asserts;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.junitsamples.model.PrivateCar;

public class AssertsTest {

	@Test
	public void assertWithoutLazyEvaluation() {
		PrivateCar privateCar = PrivateCar.of("Civic", "MLL-2222");
		assertEquals("Civic", privateCar.getModel(), "Invalid model");
	}
	
	@Test
	public void assertWithLazyEvaluation() {
		PrivateCar uber = PrivateCar.of("Civic", "MLL-2222");
		assertEquals("Civic", uber.getModel(), () -> "Invalid model");
	}
	
	/**
	 * This test will fail and report the two asserts that fail.
	 */
	@Test
	public void testAll() {
		PrivateCar privateCar = PrivateCar.of("Civic", "MLL-2222");
		
		assertAll("Private Car asserts", 
			() -> assertEquals("Parati", privateCar.getModel()),
			() -> assertEquals("123", privateCar.getPlate())
		);
	}
}
