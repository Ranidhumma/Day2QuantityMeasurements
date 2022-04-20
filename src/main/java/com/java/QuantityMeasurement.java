package com.java;

public class QuantityMeasurement {
	double feet;
	double inch;
	double yard;

	public double unitComparision(Unit unitType, double value) {
		return unitType.unit * value;

	}

}
