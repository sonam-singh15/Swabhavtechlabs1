package com.techlab.shopping;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void testOrder() {

		int expectedid = 101;
		String expecteddate = "12/3/2018";

		Order orders = new Order(101, "12/3/2018");

		assertEquals(expectedid, orders.getId());
		assertEquals(expecteddate, orders.getdate());
	}

	@Test
	void testAddItems() {
		ArrayList<LineItem> cartItems = new ArrayList<LineItem>();

		LineItem item = new LineItem(101, 3, new Product(101, "shoes", 1000, 0.25));
		boolean expectedsize = true;
		boolean actaualsize = cartItems.add(item);

		assertEquals(expectedsize, actaualsize);

	}

}
