package com.java;

import java.util.function.Function;

public enum TemperatureUnits implements Units {
	FAHRENHEIT(true), CELSIUS(false);

	final Function<Double, Double> degFToCelcius = (degF) -> {
		return ((degF.doubleValue() - 32) * 5 / 9);
	};

	final Function<Double, Double> degCToCelcius = (degC) -> {
		return degC.doubleValue();
	};
	private final Function<Double, Double> conversion_value;

	TemperatureUnits(boolean isFahrenheit) {
		if (isFahrenheit) {
			this.conversion_value = degFToCelcius;
		} else {
			this.conversion_value = degCToCelcius;
		}
	}

	public double unitConversion(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
