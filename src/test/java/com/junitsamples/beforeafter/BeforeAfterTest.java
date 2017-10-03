package com.junitsamples.beforeafter;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.PrivateCar;

public class BeforeAfterTest {

	@BeforeEach
	void beforeEach() {
		System.out.println("Running before each test.");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Running before all test.");
	}
	
	@Test
	void newUberTest() {
		PrivateCar privateCar = PrivateCar.of("Civic", "MLU-3333");
		assertAll("Private Car tests", 
				() -> assertEquals("Civic", privateCar.getModel()),
				() -> assertEquals("MLU-3333", privateCar.getPlate()));
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running after each test.");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Running after all tests.");
	}

}
