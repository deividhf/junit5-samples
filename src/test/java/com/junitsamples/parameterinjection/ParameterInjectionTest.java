package com.junitsamples.parameterinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.junitsamples.model.Uber;

@ExtendWith(UberParameterResolver.class)
public class ParameterInjectionTest {

	@Test
	public void injectedUberTest(Uber uber) {
		assertEquals("Marea", uber.getModel());
	}
}

