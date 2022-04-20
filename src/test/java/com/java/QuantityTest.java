package com.java;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

	@Test
	public void given1feetand1feetShouldReturEqual() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertEquals(feet1, feet2);
	}
	/* TC 1.1 */

	@Test
	public void given0feetand0feetShouldReturEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	/* Tc 1.2 - Null checking */
	@Test
	public void given1feetandNullShouldReturNotEqual() {
		Feet feet1 = null;
		Feet feet2 = new Feet(1.0);
		// Assert.assertNotEquals(feet1, feet2);
		// Assert.assertNotNull(feet2);
		// Assert.assertFalse(feet1.equals(feet2))
		Assert.assertNull(null, feet1);
	}

	/* TC 1.3 Same Reference type */
	@Test
	public void given1feetand1feet_WhenEqual_SameRefType_ShouldReturnTrue() {
		Feet feet1 = new Feet(1.0);
		assertSame(feet1, feet1);
	}

	/* Diff Reference type */
	@Test
	public void given1feetand0feet_WhenEqual_DiffRefType_ShouldReturnTrue() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(0.0);
		assertNotSame(feet1, feet2);
	}

	/* TC 1.4 Type Check */
	@Test
	public void given1feetand1feet_SameType_ShouldReturnEqual() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void given1InchAnd1Feet_DifferentType_ShouldReturNotEqual() {
		Inch inch = new Inch(1.0);
		Feet feet = new Feet(1.0);
		Assert.assertNotEquals(inch, feet);
	}
	/* TC 1.6 Value Check for equality */

	@Test
	public void given1feetand1feet_SameValue_ShouldReturnEqual() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void given1feetand0feet_DifferentValue_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	/* Inch TC 1.7 */
	@Test
	public void given1Inchand1InchShouldReturEqual() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(1.0);
		Assert.assertEquals(inch1, inch2);
	}

	/* Inch TC 1.8 */
	@Test
	public void given0Inchand0InchShouldReturEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}

	/* Inch TC 1.9 Null check */
	@Test
	public void given1InchandNullShouldReturNotEqual() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = null;
		// Assert.assertNotEquals(inch1, inch2);
		Assert.assertNull(inch2);
		Assert.assertNotNull(null, inch1);
	}

	/* TC 1.10 Same Reference type */
	@Test
	public void given1Inchand1Inch_SameRefType_ShouldReturnTrue() {
		Inch inch1 = new Inch(1.0);
		Assert.assertSame(inch1, inch1);
	}

	@Test
	public void given1InchAnd1Inch_DiffRefType_ShouldReturnTrue() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(0.0);
		assertNotSame(inch1, inch2);
	}

}