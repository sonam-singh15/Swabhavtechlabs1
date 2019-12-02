package com.techlab.crud;

public class CustomerDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("create in CustomerDb");

	}

	@Override
	public void read() {
		System.out.println("read in CustomerDb");

	}

	@Override
	public void update() {
		System.out.println("update in CustomerDb");

	}

	@Override
	public void delete() {
		System.out.println("delete in CustomerDb");

	}

}
