package com.java;

import org.junit.Assert;
import org.junit.Test;

public class QuantityVolumeTest {
	QuantityMeasurement qMeasurement = new QuantityMeasurement();

	/* TC 2.1: 1 gallon = 3.78 litres */
	@Test
	public void given1Litreand1Gallon_ShouldReturnEqual() {

		double value1 = qMeasurement.unitConvert(VolumeUnits.LITRE, 3.78);
		double value2 = qMeasurement.unitConvert(VolumeUnits.GALLON, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 2.2: 1 litre = 1000 Ml */
	@Test
	public void given1Litreand1000ML_ShouldReturnEqual() {

		double value1 = qMeasurement.unitConvert(VolumeUnits.MILLILITER, 1000);
		double value2 = qMeasurement.unitConvert(VolumeUnits.LITRE, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

//Addition-UC6

	/* TC1.3: 1 gallon + 3.78 litres = 7.56 litres */

	@Test
	public void givenOneGallonAndThreePoingSeventyEightLitre_ShouldReturn_SevenPointFiftySevenLitre() {
		double value1 = qMeasurement.unitAdd(VolumeUnits.GALLON, 1.0, VolumeUnits.LITRE, 3.78);
		double value2 = qMeasurement.unitConvert(VolumeUnits.LITRE, 7.56);
		Assert.assertEquals(value2, value1, 0.0);
	}

}
