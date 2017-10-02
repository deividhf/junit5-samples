package com.junitsamples.parameterinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.junitsamples.model.PrivateCar;

@ExtendWith(PrivateCarParameterResolver.class)
public class ParameterInjectionTest {

	@Test
	public void injectedUberTest(PrivateCar privateCar) {
		assertEquals("Marea", privateCar.getModel());
	}
}

