package com.techlab.collection.test;

import java.util.ArrayList;

import com.techlab.model.LineItem;

public class LineItemTest {
	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();

		cart.add(new LineItem(101, "book", 2, 430));
		cart.add(new LineItem(134, "watch", 4, 350));
		cart.add(new LineItem(171, "shoes", 1, 100));

		// cart.add("sonam");

		double checkout = 0;
		double total = 0;

		for (Object elem : cart) {
			LineItem item = (LineItem) elem;
			checkout = (item.getunitprice() * item.getquantity());
			total = total + checkout;
			System.out.println(checkout);

		}

		System.out.println("total cost is :" + total);

	}

}
