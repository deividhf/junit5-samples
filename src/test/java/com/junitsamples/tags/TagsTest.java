package com.junitsamples.tags;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.Uber;

public class TagsTest {

	@Tag("development")
	@Test
	public void testCallUberInDevelopment() {
		Uber uber = Uber.of("Development Uber", "MLL-2222");
		Uber calledUber = uber.call();
		assertFalse(calledUber.isAvailable());
	}
	
	@Tag("production")
	@Test
	public void testCallUberInProduction() {
		Uber uber = Uber.of("Production Uber", "MLL-2222");
		Uber calledUber = uber.call();
		assertFalse(calledUber.isAvailable());
	}
	
	@Tag("production")
	@Tag("development")
	@Test
	public void testCallUberInProductionAndDevelopment() {
		Uber uber = Uber.of("Civic", "MLL-2222");
		Uber calledUber = uber.call();
		assertFalse(calledUber.isAvailable());
	}
	
	@CustomTag
	public void testCallUberCustomTag() {
		Uber uber = Uber.of("Custom Uber", "MLL-2222");
		Uber calledUber = uber.call();
		assertFalse(calledUber.isAvailable());
	}
}
