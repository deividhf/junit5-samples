package com.junitsamples.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CSVSource {

	@ParameterizedTest
	@CsvSource({ "Meriva, 2003", "Montana, 2007" })
	void withCsvSource(String car, int year) {
		assertAll("CSV test",
				() -> assertTrue(car.startsWith("M")),
				() -> assertTrue(year > 1990));
	}
}
