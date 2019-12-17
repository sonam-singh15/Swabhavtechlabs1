package com.techlab.shopping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		// Arrange
		int expectedid = 101;
		String expectednanme = "shoes";
		double expectedcost = 1000;
		double expecteddis = 0.25;

		// Act
		Product pro = new Product(101, "shoes", 1000, 0.25);
		// Assert
		assertEquals(expectedid, pro.getId());
		assertEquals(expectednanme, pro.getName());
		assertEquals(expectedcost, pro.getCost());
		assertEquals(expecteddis, pro.getDiscount());
	}

	@Test
	void testGetTotalCost() {
		double expectedcost = 1250;

		Product pro = new Product(10, "shoes", 1000, 0.25);

		assertEquals(expectedcost, pro.calculateTotalCost());
	}

}
