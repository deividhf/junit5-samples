package com.junitsamples.model;

import static com.google.common.base.Preconditions.checkNotNull;

public class PrivateCar {

	private final String model;
	private final String plate;
	private final Boolean available;

	private PrivateCar(final String model, final String plate, final Boolean available) {
		this.model = model;
		this.plate = plate;
		this.available = available;
	}
	
	public static final PrivateCar of(final String model, final String plate) {
		checkNotNull(model, "Model can't be null.");
		checkNotNull(plate, "Plate can't be null.");
		return new PrivateCar(model, plate, true);
	}
	
	public String getModel() {
		return model;
	}
	
	public String getPlate() {
		return plate;
	}

	public final PrivateCar call() {
		return new PrivateCar(model, plate, false);
	}
	
	public Boolean isAvailable() {
		return available;
	}
}
