package com.junitsamples.parameterizedtest;

public enum Number {

	ONE(1),
	TWO(2),
	TREE(3);
	
	private Integer number;

	private Number(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
}
