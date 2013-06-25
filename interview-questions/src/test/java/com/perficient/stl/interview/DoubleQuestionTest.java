package com.perficient.stl.interview;

import org.junit.Before;
import org.junit.Test;

public class DoubleQuestionTest {

	DoubleQuestion cut;

	@Before
	public void setup() {
		cut = new DoubleQuestion();
	}

	@Test
	public void whatWillBePrinted() {
		double value = cut.whatWillBePrinted();
		System.out.println("value = " + value);
	}

}
