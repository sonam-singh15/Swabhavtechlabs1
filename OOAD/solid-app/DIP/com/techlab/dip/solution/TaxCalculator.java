package com.techlab.dip.solution;

public class TaxCalculator {
	private ILoggable logger;;

	public TaxCalculator(ILoggable logger) {
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		try {
			return amount / rate;
		} catch (Exception e) {
			logger.log("Error");
			return -1;
		}
	}

}
