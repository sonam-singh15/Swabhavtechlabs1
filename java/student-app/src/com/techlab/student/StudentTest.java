package com.techlab.student;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
	Student p1 = new Student(101, "Pune", "10/5/97", "IT");

	@Test
	public void testGetbranch() {
		String expected = "IT";
		String actual = p1.getbranch();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId() {
		int expected = 101;
		int actual = p1.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAddress() {
		String expected = "Pune";
		String actual = p1.getAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDob() {
		String expected = "10/5/97";
		String actual = p1.getDob();
		assertEquals(expected, actual);
	}

}
