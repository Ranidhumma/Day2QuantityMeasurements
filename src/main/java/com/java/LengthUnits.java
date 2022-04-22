package com.java;

public enum LengthUnits implements Units {
	INCH(1), FEET(12), YARD(36), CM(1 / 2.5);

	double unit;

	LengthUnits(double unitType) {
		this.unit = unitType;
	}

	public double unitConversion(double value) {
		// TODO Auto-generated method stub
		return unit * value;
	}

}