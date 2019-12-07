package com.techlab.account.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testAccountConstructorWithThreeParameter() {
		// Arrange
		String expectedaccno = "101";
		String expectedaccnanme = "Sonam";
		double expectedaccbalance = 16000;

		// Act
		Account acc = new Account("101", "Sonam", 16000);

		// Assert
		assertEquals(expectedaccno, acc.getAccountNo());
		assertEquals(expectedaccnanme, acc.getAccountName());
		assertEquals(expectedaccbalance, acc.getBalance());

	}

	@Test
	void testAccountConstructorWithTwo() {
		// Arrange
		String expectedaccno = "102";
		String expectedaccnanme = "Anjali";

		// Act
		Account acc = new Account("102", "Anjali");

		// Assert
		assertEquals(expectedaccno, acc.getAccountNo());
		assertEquals(expectedaccnanme, acc.getAccountName());

	}

	@Test
	void testDeposit() {
		// Arrange
		double expectedaccbalance = 25000;

		// Act
		Account acc = new Account("101", "Sonam", 22000);
		double actualbalance = acc.deposit(3000);

		// Assert
		assertEquals(expectedaccbalance, actualbalance);
	}

	@Test
	void testWithdraw() {
		// Arrange
		double expectedaccbalance = 2000;

		// Act
		Account acc = new Account("101", "Sonam", 5000);
		double actualbalance = acc.withdraw(3000);

		// Assert
		assertEquals(expectedaccbalance, actualbalance);

	}

}
