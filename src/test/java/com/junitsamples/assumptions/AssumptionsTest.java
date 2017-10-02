package com.junitsamples.assumptions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AssumptionsTest {

	/**
	 * This test will run only on Monday.
	 */
	@Test
	public void assumeTrueTest() {
		assumeTrue(LocalDate.now().getDayOfWeek().equals(DayOfWeek.MONDAY));
		assertFalse(true);
	}

	@Test
	public void assumeFalseTest() {
		assumeFalse(1 == 2);
		assertFalse(false);
	}
	
}
