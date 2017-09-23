package com.junitsamples.parameterizedtest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 3, 4, 5 })
	public void isGreaterThanZero(Integer id) {
	  assertTrue(id > 0);
	}
}
