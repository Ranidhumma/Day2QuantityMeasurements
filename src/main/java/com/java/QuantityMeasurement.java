package com.java;

public class QuantityMeasurement {
	double feet;
	double inch;

	public double unitComparision(Unit name, double value) {
		return name.unit * value;

	}

}
