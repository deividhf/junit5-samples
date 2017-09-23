package com.junitsamples.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.junitsamples.model.Uber;

public class MethodSourceTest {

	@ParameterizedTest
	@MethodSource(value = "uberProvider")
	public void modelStartsWithA(Uber uber) {
	  assertTrue(uber.getModel().startsWith("M"));
	}
	
	static Stream<Uber> uberProvider() {
	    return Stream.of(
	    		Uber.of("Meriva", "MLY-2222"), 
	    		Uber.of("Marea", "ZLY-3322"));
	}
}
