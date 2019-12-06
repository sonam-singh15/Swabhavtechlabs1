package com.techlab.shopping.test;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;

public class Invoice {
	public static void main(String[] args) {

		Customer c1 = new Customer(101, "Sonam");
		c1.addOrders(new Order(102, "12/3/2018"));
		c1.displayOrder();

		Order o1 = new Order(01, "12/3/2017");
		o1.addItems(new LineItem(101, "Shoes", 2, 300));
		o1.addItems(new LineItem(102, "Bag", 2, 1000));
		o1.displayItem();
		System.out.println("Checkout details of order1:" + o1.checkOut());

		System.out.println(" ");

		Customer c2 = new Customer(102, "Anjali");
		c2.addOrders(new Order(101, "10/4/2018"));
		c2.displayOrder();

		Order o2 = new Order(01, "12/3/2017");
		o2.addItems(new LineItem(390, "Watches", 6, 300));
		o2.addItems(new LineItem(12, "Mobile", 1, 1000));
		o2.displayItem();

	}
}
