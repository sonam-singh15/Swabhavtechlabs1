package com.techlab.crud;

public class InvoiceDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("create in InvoiceDb");

	}

	@Override
	public void read() {
		System.out.println("read from InvoiceDb");
	}

	@Override
	public void update() {
		System.out.println("update in InvoiceDb");
	}

	@Override
	public void delete() {
		System.out.println("delete from InvoiceDb");
	}

}
