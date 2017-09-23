package com.junitsamples.beforeafter;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.Uber;

public class BeforeAfterTest {

	@BeforeEach
	public void beforeEach() {
		System.out.println("Running before each test.");
	}
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Running before all test.");
	}
	
	@Test
	public void newUberTest() {
		Uber uber = Uber.of("Civic", "MLU-3333");
		assertAll("Uber tests", 
				() -> assertEquals("Civic", uber.getModel()),
				() -> assertEquals("MLU-3333", uber.getPlate()));
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Running after each test.");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("Running after all tests.");
	}

}
