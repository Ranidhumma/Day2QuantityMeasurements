package com.java;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTemperatureTest {

	QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

	/* TC: 212F = 100C */
	@Test
	public void given1Feetand30CmShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConvert(TemperatureUnits.FAHRENHEIT, 212.00);
		double value2 = quantityMeasurement.unitConvert(TemperatureUnits.CELSIUS, 100.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

}
