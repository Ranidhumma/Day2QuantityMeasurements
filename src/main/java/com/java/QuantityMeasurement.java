package com.java;

public class QuantityMeasurement {
	double feet;
	double inch;
	double yard;

	public double unitCompare(Unit unitType, double value) {
		// TODO Auto-generated method stub
		return unitType.unit * value;

	}

}
