package com.techlab.student;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessorTest {
	Professor p2 = new Professor(110, "Kolkata", "15/7/90");

	@Test
	public void testGetId() {
		int expected = 110;
		int actual = p2.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAddress() {
		String expected = "Kolkata";
		String actual = p2.getAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDob() {
		String expected = "15/7/90";
		String actual = p2.getDob();
		assertEquals(expected, actual);
	}

	@Test
	public void testCalculateSalary() {
		double unexpected = 25000;
		double actual = p2.calculateSalary();
		assertNotEquals(unexpected, actual);

	}

}
