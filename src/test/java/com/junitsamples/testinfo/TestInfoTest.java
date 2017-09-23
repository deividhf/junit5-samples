package com.junitsamples.testinfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoTest {

	@Test
	@DisplayName("Test Info")
	public void showingTestInfo(TestInfo testInfo) {
		assertEquals("Test Info", testInfo.getDisplayName());
	}
}
