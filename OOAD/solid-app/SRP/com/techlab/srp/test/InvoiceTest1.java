package com.techlab.srp.test;

import com.techlab.srp.violation.Invoice;

public class InvoiceTest1 {
	public static void main(String[] args) {

		Invoice invoice = new Invoice(101, "sonam", 500.0, 25.0f);
		invoice.printInvoice(invoice);

	}

}
