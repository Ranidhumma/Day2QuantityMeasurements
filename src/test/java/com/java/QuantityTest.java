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

	/* Tc 1.2 - Null check */

	@Test
	public void given1feetandNullShouldReturNotEqual() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = null;
		// Assert.assertNotEquals(feet1, feet2);
		// Assert.assertNotNull(feet1);
		Assert.assertFalse(feet1.equals(feet2));

	}
}
