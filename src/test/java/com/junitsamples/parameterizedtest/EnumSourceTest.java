package com.junitsamples.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {

	@ParameterizedTest
	@EnumSource(Number.class)
	public void findById(Number number) {
	  assertTrue(number.getNumber() > 0);
	}
}
