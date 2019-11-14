package com.techlab.testjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJunit {
	String message1 = "Hello ";
	String message2 = "Hello  World";

	MessageUtil messageUtil = new MessageUtil(message2);

	@Test
	public void testPrintMessage() {
		String a = "abcde";
		String b = new String(a);
		assertTrue(a.equals(b));
		assertFalse(a == b);
		assertEquals(a, b);

		//assertEquals(message1, messageUtil.printMessage());

	}
}
