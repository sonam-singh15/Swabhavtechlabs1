package com.techlabs.customertest;

import com.techlabs.customer.CardType;
import com.techlabs.customer.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("sonam", CardType.MASTERCARD);
		Customer c2 = new Customer("Anjali", CardType.AMERICANEXPRESS);
		Customer c3 = new Customer("Anjali", CardType.VISA);

		printInfo(c1);

		System.out.println();

		printInfo(c2);

		System.out.println();

		printInfo(c3);
		printInfo(c1);
	}

	public static void printInfo(Customer c) {
		System.out.println("CustomerId:-" + c.getId());
		System.out.println("CustomerName:-" + c.getName());
		System.out.println("Card Type :-" + c.getCardType());
	}

}
