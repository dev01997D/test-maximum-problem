/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.blz.testmaximum.tester;

import org.junit.Test;
import com.blz.testmaximum.runner.TestMaximumMain;
import org.junit.Assert;

public class TestMaximumTest {
	@Test
	public void test_Given_MaxInteger_At1st_Position_Returns_Same_Number() {
		Integer actual = 65;
		Integer expected = new TestMaximumMain().findMaxInteger(65, 45, 60);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_Given_MaxInteger_At_2nd_Position_Returns_Same_Number() {
		Integer actual = 96;
		Integer expected = new TestMaximumMain().findMaxInteger(65, 96, 40);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_Given_MaxInteger_At_3rd_Position_Returns_Same_Number() {
		Integer actual = 115;
		Integer expected = new TestMaximumMain().findMaxInteger(65, 96, 115);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_Given_Max_Float_At_1st_Position_Returns_Same_Number() {
		Float actual = 11.5f;
		Float expected = new TestMaximumMain().findMaxFloat(11.5f, 8.6f, 5.9f);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_Given_Max_Float_At_2nd_Position_Returns_Same_Number() {
		Float actual = 45.9f;
		Float expected = new TestMaximumMain().findMaxFloat(11.5f, 45.9f, 30.2f);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_Given_Max_Float_At_3rd_Position_Returns_Same_Number() {
		Float actual = 95.6f;
		Float expected = new TestMaximumMain().findMaxFloat(70.6f, 32.5f, 95.6f);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_Given_Max_String_At_1st_Position_Returns_Same_Number() {
		String actual = "Manohar";
		String expected = new TestMaximumMain().findMaxString("Manohar", "Apple", "Dev");
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_Given_Max_String_At_2nd_Position_Returns_Same_Number() {
		String actual = "Ram";
		String expected = new TestMaximumMain().findMaxString("Manohar", "Ram", "Dev");
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test_Given_Max_String_At_3rd_Position_Returns_Same_Number() {
		String actual = "Wangdu";
		String expected = new TestMaximumMain().findMaxString("Manohar", "Ram", "Wangdu");
		Assert.assertEquals(expected, actual);
	}
}
