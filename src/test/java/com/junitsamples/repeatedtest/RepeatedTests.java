package com.junitsamples.repeatedtest;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {

	@RepeatedTest(value = 4)
	public void repeatTestFourTimes(RepetitionInfo repetitionInfo) {
		System.out.println(repetitionInfo.getCurrentRepetition());
	}
}
