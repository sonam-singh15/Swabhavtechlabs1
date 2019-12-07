package com.techlab.shopping.test;

import java.io.FileOutputStream;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;

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
		o1.addItems(new LineItem(101, "Shoes", 2, 300));
		o1.addItems(new LineItem(102, "Bag", 2, 1000));
		o1.modifyItem(new LineItem(102, "Bag", 3, 600));
		o1.displayItem();

		System.out.println("Checkout details of order1:" + o1.checkOut());
	}

	
}
