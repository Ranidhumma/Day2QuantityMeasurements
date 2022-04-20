package com.java;

public class QuantityMeasurement {
	double feet;
	double inch;

	public double unitComparision(Unit unit, double value) {
		return unit.unit * value;

	}

}
