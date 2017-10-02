package com.junitsamples.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.junitsamples.model.PrivateCar;

public class MethodSourceTest {

	@ParameterizedTest
	@MethodSource(value = "uberProvider")
	public void modelStartsWithA(PrivateCar privateCar) {
	  assertTrue(privateCar.getModel().startsWith("M"));
	}
	
	static Stream<PrivateCar> privateCarProvider() {
	    return Stream.of(
	    		PrivateCar.of("Meriva", "MLY-2222"), 
	    		PrivateCar.of("Marea", "ZLY-3322"));
	}
}
