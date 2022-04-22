package com.java;

import org.junit.Assert;
import org.junit.Test;

public class QuantityWeightsTest {
	QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

	/* TC3.1: 1 kg = 1000 grams */
	@Test
	public void given1KgAnd1000Gram_ShouldReturnEqual() {

		double value1 = quantityMeasurement.unitConvert(WeightsUnits.KILOGRAM, 1);
		double value2 = quantityMeasurement.unitConvert(WeightsUnits.GRAM, 1000);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 3.2:* 1 tonne = 1000 kgs */
	@Test
	public void given1TonneAnd1000Kg_ShouldReturnEqual() {

		double value1 = quantityMeasurement.unitConvert(WeightsUnits.TONNE, 1.0);
		double value2 = quantityMeasurement.unitConvert(WeightsUnits.KILOGRAM, 1000);
		Assert.assertEquals(value1, value2, 0.0);
	}

}
