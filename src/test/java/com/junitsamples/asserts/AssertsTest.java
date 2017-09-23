package com.junitsamples.asserts;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.junitsamples.model.Uber;

public class AssertsTest {

	@Test
	public void assertWithoutLazyEvaluation() {
		Uber uber = Uber.of("Civic", "MLL-2222");
		assertEquals("Civic", uber.getModel(), "Invalid model");
	}
	
	@Test
	public void assertWithLazyEvaluation() {
		Uber uber = Uber.of("Civic", "MLL-2222");
		assertEquals("Civic", uber.getModel(), () -> "Invalid model");
	}
	
	@Test
	public void testAll() {
		Uber uber = Uber.of("Civic", "MLL-2222");
		
		assertAll("Uber asserts", 
			() -> assertEquals("Parati", uber.getModel()),
			() -> assertEquals("123", uber.getPlate())
		);
	}
}
