package com.java;

public enum WeightsUnits implements Units {

	KILOGRAM(1000), GRAM(1), TONNE(1000000);

	private double unit;

	WeightsUnits(double unitType) {
		this.unit = unitType;
	}

	public double unitConversion(double value) {
		return unit * value;
	}

}
