package com.java;

public enum Unit {

	FEET(12), INCH(1), YARD(36), CM(1 / 2.5); // base is Inch
	// FEET(30), INCH(2.5), YARD(90), CM(1); // base is cm

	public double unit;

	Unit(double unit) {
		// TODO Auto-generated constructor stub
		this.unit = unit;
	}
}
