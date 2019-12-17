package com.techlab.srp.solution;

import com.techlab.srp.Invoice;
import com.techlab.srp.InvoicePrinter;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice invoice = new Invoice(101, "sonam", 500.0, 25.0f);
		InvoicePrinter printer = new InvoicePrinter(invoice);
		printer.printToConsole();

	}

}
