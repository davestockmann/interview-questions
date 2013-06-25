package com.perficient.stl.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MathTest {

	// Finish this test

	Math cut;

	@Before
	public void setup() {
		cut = new Math();
	}

	@Test
	public void add() {
		int a = 1;
		int b = 3;
		int expected = 4;
		int val = cut.add(a, b);
		assertEquals(expected, val);
	}

	@Test
	public void subtract() {
		int a = 0;
		int b = 0;
		int expected = 5;
		int val = cut.subtract(a, b);
	}

}
