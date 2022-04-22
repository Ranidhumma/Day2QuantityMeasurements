package com.java;

public class QuantityMeasurement {
	private double value;

	public double unitConvert(Units unitType, double value) {
		return unitType.unitConversion(value);
	}

	public double unitAdd(Units unitType1, double value1, Units unitType2, double value2) {
		return unitType1.unitConversion(value1) + unitType2.unitConversion(value2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityMeasurement other = (QuantityMeasurement) obj;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

}
