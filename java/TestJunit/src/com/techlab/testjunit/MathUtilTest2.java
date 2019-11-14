package com.techlab.testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathUtilTest2 {

	@Test
	public void testAdd() {
		MathUtil mathutils = new MathUtil();
		int expected = 2;
		int actual = mathutils.add(1, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		MathUtil mathutils = new MathUtil();
		int expected = -3;
		int actual = mathutils.sub(3, 6);
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		MathUtil mathutils = new MathUtil();
		int expected = 48;
		int actual = mathutils.multiply(-6, -8);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		MathUtil mathutils = new MathUtil();
		int expected = 3;
		int actual = mathutils.divide(18, 6);
		assertEquals(expected, actual);
	}

}
