package com.java;

public enum VolumeUnits implements Units {

	GALLON(3780), LITRE(1000), MILLILITER(1); // base is ml

	private double unit;

	VolumeUnits(double unitType) {
		// TODO Auto-generated constructor stub
		this.unit = unitType;
	}

	public double unitConversion(double value) {
		// TODO Auto-generated method stub
		return unit * value;
	}

}
