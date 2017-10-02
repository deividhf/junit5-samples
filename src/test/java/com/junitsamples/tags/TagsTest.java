package com.junitsamples.tags;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.PrivateCar;

public class TagsTest {

	@Tag("development")
	@Test
	public void testCallPrivateCarInDevelopment() {
		PrivateCar privateCar = PrivateCar.of("Development PrivateCar", "MLL-2222");
		PrivateCar calledPrivateCar = privateCar.call();
		assertFalse(calledPrivateCar.isAvailable());
	}
	
	@Tag("production")
	@Test
	public void testCallPrivateCarInProduction() {
		PrivateCar privateCar = PrivateCar.of("Production PrivateCar", "MLL-2222");
		PrivateCar calledPrivateCar = privateCar.call();
		assertFalse(calledPrivateCar.isAvailable());
	}
	
	@Tag("production")
	@Tag("development")
	@Test
	public void testCallPrivateCarInProductionAndDevelopment() {
		PrivateCar privateCar = PrivateCar.of("Civic", "MLL-2222");
		PrivateCar calledPrivateCar = privateCar.call();
		assertFalse(calledPrivateCar.isAvailable());
	}
	
	@CustomTag
	public void testCallPrivateCarCustomTag() {
		PrivateCar privateCar = PrivateCar.of("Custom PrivateCar", "MLL-2222");
		PrivateCar calledPrivateCar = privateCar.call();
		assertFalse(calledPrivateCar.isAvailable());
	}
}
