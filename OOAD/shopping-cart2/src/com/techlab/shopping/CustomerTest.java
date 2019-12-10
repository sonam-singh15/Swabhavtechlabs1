package com.techlab.shopping;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testcustomer() {
		int expectedid = 101;
		String expectedname = "sonam";

		Customer customers = new Customer(101, "sonam");

		assertEquals(expectedid, customers.getId());
		assertEquals(expectedname, customers.getName());
	}

	@Test
	public void testAddOrders() {

		ArrayList<Order> orders = new ArrayList<Order>();

		Order order1 = new Order(101, "12/3/2018");
		boolean expectedsize = true;
		boolean actaualsize = orders.add(order1);

		assertEquals(expectedsize, actaualsize);

	}

	public void testCustomerMatch() {

		Customer expectedCustomerListOutput = new Customer(101, "sonam");
		int actualCustomerListOutput = 1;

		assertEquals(expectedCustomerListOutput, actualCustomerListOutput);
	}

}
