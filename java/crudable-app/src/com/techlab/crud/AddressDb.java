package com.techlab.crud;

public class AddressDb implements Icrudable {

	@Override
	public void create() {
		System.out.println("create in AddressDb");

	}

	@Override
	public void read() {
		System.out.println("read in AddressDb");

	}

	@Override
	public void update() {
		System.out.println("update in AddressDb");

	}

	@Override
	public void delete() {
		System.out.println("delete in AddressDb");

	}

}
