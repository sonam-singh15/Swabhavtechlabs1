package com.techlab.crud.test;

import com.techlab.crud.AddressDb;
import com.techlab.crud.CustomerDb;
import com.techlab.crud.Icrudable;
import com.techlab.crud.InvoiceDb;

public class CrudTest {
	public static void main(String[] args) {
		Icrudable x;
		x = new InvoiceDb();
		doDbOperations(new InvoiceDb());

		System.out.println(" ");

		x = new CustomerDb();
		doDbOperations(new CustomerDb());

		System.out.println(" ");

		x = new AddressDb();
		doDbOperations(new AddressDb());

	}

	public static void doDbOperations(Icrudable x) {
		x.create();
		x.read();
		x.update();
		x.delete();
	}
}
