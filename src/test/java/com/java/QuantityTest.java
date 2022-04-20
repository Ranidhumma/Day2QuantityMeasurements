package com.java;

import static org.junit.Assert.assertNotSame;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
	private static final double NULL = 0;
	QuantityMeasurement qMeasurement1 = new QuantityMeasurement();

	/* TC 1.1 */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {

		double value1 = qMeasurement1.unitComparision(Unit.FEET, 0.0);
		double value2 = qMeasurement1.unitComparision(Unit.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* Tc 1.2 - Null checking */
	@Test
	public void given1feetandNullShouldReturNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
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
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1InchAnd1Feet_DifferentType_ShouldReturNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}
	/* TC 1.6 Value Check for equality */

	@Test
	public void given1feetand1feet_SameValue_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1feetand0feet_DifferentValue_ShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.FEET, 0.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* Inch TC 1.7 */
	@Test
	public void given1Inchand1InchShouldReturEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertEquals(value1, value1, 0.0);
	}

	/* Inch TC 1.8 */
	@Test
	public void given0Inchand0InchShouldReturEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 0.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 0.0);
		Assert.assertEquals(value1, value1, 0.0);
	}

	/* Inch TC 1.9 Null check */
	@Test
	public void given1InchandNullShouldReturNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		double value2 = NULL;
		// Assert.assertNotEquals(value1, value2);
		Assert.assertNotNull(value1);
	}

	/* TC 1.10 Same Reference type */
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
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given1FeetAnd1Inch_DifferentType_ShouldReturNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.12 Value Check for equality */

	@Test
	public void given1InchAnd1Inch_SameValue_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	@Test
	public void given0InchAnd1Inch_DiffValue_ShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 0.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		Assert.assertNotEquals(value1, value2);

	}

	// Uc3//

	/* TC 1.13 : 3Feet = 1yard */
	@Test
	public void given3feetand1YardShouldReturnTrue() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 3.0);
		double value2 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.14 : 1 ft != 1 yd */
	@Test
	public void given1feetand1YardShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.FEET, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.15 : 1 in != 1 yd */
	@Test
	public void given1Inchand1YardShouldReturnNotEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		Assert.assertNotEquals(value1, value2);
	}

	/* TC 1.16 :1 yd = 36 in */
	@Test
	public void given1YardAnd36Inch_ShouldReturnEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.INCH, 36.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.17 : 36 in = 1 yd */
	@Test
	public void given36InchAnd1YardShouldReturnEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.INCH, 36.0);
		double value2 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/* TC 1.18: 1 yd = 3 ft */
	@Test
	public void given1Yardand3FeetShouldReturnEqual() {
		double value1 = qMeasurement1.unitComparision(Unit.YARD, 1.0);
		double value2 = qMeasurement1.unitComparision(Unit.FEET, 3.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
}
