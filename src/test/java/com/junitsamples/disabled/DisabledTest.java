package com.junitsamples.disabled;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.junitsamples.model.PrivateCar;

public class DisabledTest {

	@Test
	@Disabled
	void disabledTest() {
		assertThat(1, is(equalTo(Integer.valueOf("1"))));
	}
	
	@Test
	@Disabled("Disabled test with a reason")
	void disabledTestWithReason() {
		PrivateCar privateCar = PrivateCar.of("Megane", "MLI-3666");
		assertThat(privateCar.getModel(), is(equalTo("Megane")));
	}
}
