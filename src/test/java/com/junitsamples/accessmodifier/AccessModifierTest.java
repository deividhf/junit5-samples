package com.junitsamples.accessmodifier;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class AccessModifierTest {

	@Test
	protected void protectedTest() {
		assertThat(1, is(equalTo(Integer.valueOf("1"))));
	}
	
	@Test
	void packagePrivateTest() {
		assertThat(2, is(equalTo(Integer.valueOf("2"))));
	}
	
	@Test
	public void publicTest() {
		assertThat(3, is(equalTo(Integer.valueOf("3"))));
	}
	
}
