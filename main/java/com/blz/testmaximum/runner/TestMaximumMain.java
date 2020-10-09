/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.blz.testmaximum.runner;

public class TestMaximumMain {
	Integer a, b, c;

	public TestMaximumMain() {
	}

	// Printing the largest number
	public void printMaxNumber() {
		System.out.println("The maximum number is : " + findMaxInteger(a, b, c));
	}

	// To find Maximum integer number from input
	public Integer findMaxInteger(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	// To find Maximum float number from input
	public Float findMaxFloat(Float f1, Float f2, Float f3) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	// To find Maximum String from input
	public String findMaxString(String s1, String s2, String s3) {
		String max = s1;
		if (s2.compareTo(max) > 0)
			max = s2;
		if (s3.compareTo(max) > 0)
			max = s3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Max Integer number is : " + new TestMaximumMain().findMaxInteger(78, 89, 15));
		System.out.println("Max Float number is : " + new TestMaximumMain().findMaxFloat(8.9f, 45.2f, 40.6f));
		System.out.println("Max String is : " + new TestMaximumMain().findMaxString("PineApple", "Apple", "Wanana"));
	}
}
