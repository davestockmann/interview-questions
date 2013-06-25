package com.perficient.stl.interview;

public class Overflow {

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		long b = a + 100;
		System.out.println((int) b - a);
		System.out.println((int) (b - a));

	}

}
