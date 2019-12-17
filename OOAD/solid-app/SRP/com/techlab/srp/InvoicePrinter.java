package com.techlab.srp;

public class InvoicePrinter {
	public Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void printToConsole() {
		System.out.println(" Id :-" + invoice.getId());
		System.out.println(" Name :-" + invoice.getName());
		System.out.println(" Amount :-" + invoice.getAmount());
		System.out.println(" CostAfterDiscount :-" + invoice.calculateDiscount());
		System.out.println("CostAfterGst :-" + invoice.calculateGst());
		System.out.println("TotalCost :-" + invoice.calculateTotalCost());
	}
}
