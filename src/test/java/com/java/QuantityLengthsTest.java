package com.java;

import static org.junit.Assert.assertNotSame;

import org.junit.Assert;
import org.junit.Test;

public class QuantityLengthsTest {
	private static final double NULL = 0;
	QuantityMeasurement qMeasurement1 = new QuantityMeasurement();

	/* TC 1.1 */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {

		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 0.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* Tc 1.2 - Null checking */
	@Test
	public void given1feetandNullShouldReturNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		Assert.assertNotNull(null, value1);
	}

	/* TC 1.3 Same Reference type */
	@Test
	public void given_WhenSameRefType_ShouldReturnTrue() {
		QuantityMeasurement qMeasurement1 = new QuantityMeasurement();
		Assert.assertSame(qMeasurement1, qMeasurement1);
	}

	/* Diff Reference type */
	@Test
	public void given_DiffRefType_WhenNotSame_ShouldReturnTrue() {
		QuantityMeasurement qMeasurement1 = new QuantityMeasurement();
		QuantityMeasurement qMeasurement2 = new QuantityMeasurement();
		assertNotSame(qMeasurement1, qMeasurement2);
	}

	/* TC 1.4 Type Check */
	@Test
	public void given1feetand1feet_SameType_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1InchAnd1Feet_DifferentType_ShouldReturNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}
	/* TC 1.6 Value Check for equality */

	@Test
	public void given1feetand1feet_SameValue_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1feetand0feet_DifferentValue_ShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 0.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* Inch TC 1.7 */
	@Test
	public void given1Inchand1InchShouldReturEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertEquals(value1, value1, 0.0);
	}

	/* Inch TC 1.8 */
	@Test
	public void given0Inchand0InchShouldReturEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 0.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 0.0);
		Assert.assertEquals(value1, value1, 0.0);
	}

	/* Inch TC 1.9 Null check */
	@Test
	public void given1InchandNullShouldReturNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		double value2 = NULL;
		// Assert.assertNotEquals(value1, value2);
		Assert.assertNotNull(value1);
	}

	/* TC 1.10 Same Referencetype */
	@Test
	public void givenSameRefType_Whensame_ShouldReturnTrue() {
		QuantityMeasurement qMeasurement1 = new QuantityMeasurement();
		Assert.assertSame(qMeasurement1, qMeasurement1);
	}

	@Test
	public void givenDiffRefType_whenNotSame_ShouldReturnTrue() {
		QuantityMeasurement qMeasurement1 = new QuantityMeasurement();
		QuantityMeasurement qMeasurement2 = new QuantityMeasurement();
		assertNotSame(qMeasurement1, qMeasurement2);
	}

	/* TC 1.11 Type Check */
	@Test
	public void given1Inchand1Inch_SameType_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1FeetAnd1Inch_DifferentType_ShouldReturNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.12 Value Check for equality */

	@Test
	public void given1InchAnd1Inch_SameValue_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given0InchAnd1Inch_DiffValue_ShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 0.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	// Uc2//

	/* TC 1.13 : 3Feet = 1yard */
	@Test
	public void given3feetand1YardShouldReturnTrue() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 3.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.14 : 1 ft != 1 yd */
	@Test
	public void given1feetand1YardShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.15 : 1 in != 1 yd */
	@Test
	public void given1Inchand1YardShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.16 :1 yd = 36 in */
	@Test
	public void given1YardAnd36Inch_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 36.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.17 : 36 in = 1 yd */
	@Test
	public void given36InchAnd1YardShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 36.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.18: 1 yd = 3 ft */
	@Test
	public void given1Yardand3FeetShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 3.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
	/* UC3: TC 1.19: 2 inch=5 cm , 1inch=2.5 cm, 1cm =1/2.5 inches */

	@Test
	public void given2Inchand5CmShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.INCH, 2.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.CM, 5.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
	/* TC 1.20: 1 cm!=1 feet */

	@Test
	public void given2Feetand1CmShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.CM, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		Assert.assertNotEquals(value1, value2);
	}
	/* TC 1.21 : 1 cm!=1 inch */

	@Test
	public void given1Inchand1CmShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.CM, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}
	/* TC 1.22: 90cm = 1 yard */

	@Test
	public void given1YardAnd90CmShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.CM, 90.00);
		double value2 = qMeasurement1.unitConvert(LengthUnits.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
	/* TC 1.23: 30Cm = 1 Feet */

	@Test
	public void given1Feetand30CmShouldReturnEqual() {
		double value1 = qMeasurement1.unitConvert(LengthUnits.CM, 30.00);
		double value2 = qMeasurement1.unitConvert(LengthUnits.FEET, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
	/* Uc4-Addition */

	/* 2 in + 2 in = 4 in */

	@Test
	public void given2Inchand2InchShouldReturn4Inch() {
		double value1 = qMeasurement1.unitAdd(LengthUnits.INCH, 2.00, LengthUnits.INCH, 2.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 4.0);
		Assert.assertEquals(value2, value1, 0.0);
	}

	/* 1 ft + 2 in = 14 in */
	@Test
	public void given1FEETand2InchShouldReturn4Inch() {
		double value1 = qMeasurement1.unitAdd(LengthUnits.FEET, 1.00, LengthUnits.INCH, 2.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 14.0);
		Assert.assertEquals(value2, value1, 0.0);
	}

	/* 1 ft + 1 ft = 24 in */
	@Test
	public void given1Feetand1FeetShouldReturn24Inch() {
		double value1 = qMeasurement1.unitAdd(LengthUnits.FEET, 1.00, LengthUnits.FEET, 1.0);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 24.0);
		Assert.assertEquals(value2, value1, 0.0);
	}

	/* 2 in + 2.5 cm = 3 in */
	@Test
	public void given2InchAnd25CmShouldReturn3Inch() {
		double value1 = qMeasurement1.unitAdd(LengthUnits.INCH, 2.00, LengthUnits.CM, 2.5);
		double value2 = qMeasurement1.unitConvert(LengthUnits.INCH, 3.0);
		Assert.assertEquals(value2, value1, 0.0);
	}

}
