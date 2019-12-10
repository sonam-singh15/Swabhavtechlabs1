package com.techlab.shopping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void testLineItem() {
		int expectedid = 101;
		int expectedquantity = 3;
		Product pro = new Product(101, "shoes", 1000, 0.25);
		// Act
		LineItem item = new LineItem(101, 3, new Product(101, "shoes", 1000, 0.25));
		// Assert
		assertEquals(expectedid, item.getId());
		assertEquals(expectedquantity, item.getquantity());
		assertEquals(pro, item.getProduct());

	}

	@Test
	void testCalculateItemCost() {
		double expectedcost = 750;

		LineItem item = new LineItem(10, 3, new Product(101, "shoes", 1000, 0.25));
		double actualtotalcost = item.calculateItemCost();

		assertEquals(expectedcost, actualtotalcost);

	}

}
