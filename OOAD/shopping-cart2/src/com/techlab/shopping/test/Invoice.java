package com.techlab.shopping.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlab.shopping.Customer;
import com.techlab.shopping.LineItem;
import com.techlab.shopping.Order;
import com.techlab.shopping.Product;

public class Invoice {
	public static void main(String[] args) throws IOException {

		Customer c1 = new Customer(101, "Sonam");
		orderInfo(c1);
		displayDetail(c1);
		System.out.println(" ");

	}

	public static void orderInfo(Customer c1) {

		Order o1 = new Order(01, "12/3/2017");
		o1.addItems(new LineItem(101, 2, new Product(11, "shoes", 600, 0.25f)));
		o1.addItems(new LineItem(101, 3, new Product(11, "shoes", 600, 0.25f)));
		o1.addItems(new LineItem(102, 4, new Product(12, "bags", 600, 0.25f)));

		c1.addOrders(o1);

	}

	public static void displayDetail(Customer c) {
		System.out.println("Customer Name: " + c.getName());
		for (Order order : c.getOrders()) {
			System.out.println("Order Date :" + order.getdate());
			for (LineItem item : order.getItem()) {
				System.out.println(item);

			}
			System.out.println("Checkout details of order1:" + order.checkOut());
		}

	}

}