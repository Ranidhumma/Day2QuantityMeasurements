package com.java;

import org.junit.Assert;
import org.junit.Test;

public class QuantityVolumeTest {
	QuantityMeasurement qMeasurement = new QuantityMeasurement();

	/* TC 1.1 gallon = 3.78 litres */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {

		double value1 = qMeasurement.unitConvert(VolumeUnits.LITRE, 3.78);
		double value2 = qMeasurement.unitConvert(VolumeUnits.GALLON, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC1.2: 1 litre = 1000 Ml */

	@Test
	public void given1litreand1000Ml_ShouldReturnEqual() {

		double value1 = qMeasurement.unitConvert(VolumeUnits.LITRE, 1.0);
		double value2 = qMeasurement.unitConvert(VolumeUnits.MILLILITER, 1000.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
}
