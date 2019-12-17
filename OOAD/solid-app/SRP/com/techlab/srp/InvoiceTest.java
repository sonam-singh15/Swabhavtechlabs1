package com.techlab.srp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTest {

	@Test
	void testInvoice() {
		// Arrange
		int expectedid = 101;
		String expectedname = "Sonam";
		double expectedamount = 500.0;
		float expecteddiscount = 25.0f;

		// Act
		Invoice invoice = new Invoice(101, "sonam", 500.0, 25.0f);

		// Assert
		assertEquals(expectedid, invoice.getId());
		assertEquals(expectedname, invoice.getName());
		assertEquals(expectedamount, invoice.getAmount());
		assertEquals(expecteddiscount, invoice.getDiscount());

	}

	@Test
	void testCalculateDiscount() {
		
	}

	@Test
	void testCalculateGst() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculateTotalCost() {
		fail("Not yet implemented");
	}

}
