package com.techlab.shopping;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {
	private int id;
	private String date;
	private ArrayList<LineItem> items;

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		items = new ArrayList<LineItem>();
	}

	public int getId() {
		return id;
	}

	public String getdate() {
		return date;
	}

	public void addItems(LineItem lineitem) {
		items.add(lineitem);
	}

	public void store() {
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Swabhav\\Desktop\\customer.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(items);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved \n ");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public double checkOut() {
		double total = 0;
		for (LineItem item : items) {
			double checkout = item.getItemCost() * item.getquantity();
			total = total + checkout;
		}
		return total;
	}

	public void displayItem() {
		System.out.println(items.size() + "items");
		for (LineItem item : items) {
			System.out.println(item.toString());
		}
	}

}
