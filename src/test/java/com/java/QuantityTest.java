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
}
