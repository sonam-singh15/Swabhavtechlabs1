package com.techlab.shopping.test;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;

public class Invoice {
	public static void main(String[] args) {

		Customer c1 = new Customer(101, "Sonam");
		printInfo(c1);
		System.out.println(" ");

	}

	public static void printInfo(Customer c1) {

		c1.addOrders(new Order(102, "12/3/2018"));
		c1.displayOrder();

		Order o1 = new Order(01, "12/3/2017");
		o1.addItems(new LineItem(101, 2, new Product(11, "shoes", 600, 0.25f)));
		o1.addItems(new LineItem(101, 3, new Product(11, "shoes", 600, 0.25f)));
		o1.addItems(new LineItem(102, 4, new Product(12, "bags", 600, 0.25f)));


		o1.displayItem();
		System.out.println("Checkout details of order1:" + o1.checkOut());
	}

}
