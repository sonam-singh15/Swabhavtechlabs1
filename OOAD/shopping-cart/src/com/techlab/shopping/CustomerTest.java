package com.techlab.shopping;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	Customer c = new Customer(101, "sonam");
	Order o1 = new Order(01, "12/3/2017");

	@Test
	public void testCustomer() {
		Customer c = new Customer(101, "sonam");
	}

	@Test
	public void testGetId() {
		int expected = 101;
		int actual = c.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testAddOrders() {
		c.addOrders(o1);
	}

	public void testCustomerMatch() {

		Customer expectedCustomerListOutput = new Customer(101, "sonam");
		int actualCustomerListOutput = 1;

		assertEquals(expectedCustomerListOutput, actualCustomerListOutput);
	}

}
