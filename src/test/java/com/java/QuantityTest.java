package com.java;

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
		Assert.assertNotEquals(feet1, feet2);
		// Assert.assertNotNull(feet1);
		// Assert.assertFalse(feet1.equals(feet2))
		// Assert.assertNull(null, feet1);
	}

	/* TC 1.3 Same Reference type */
	@Test
	public void given1feetand1feet_WhenEqual_SameRefType_ShouldReturnTrue() {
		Feet feet1 = new Feet(1.0);
		boolean result = (feet1.equals(feet1));
		Assert.assertTrue(result);
	}

	/* Diff Reference type */
	@Test
	public void given1feetand0feet_WhenEqual_DiffRefType_ShouldReturnFalse() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(0.0);
		boolean result = (feet1.equals(feet2));
		Assert.assertFalse(result);
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

}
