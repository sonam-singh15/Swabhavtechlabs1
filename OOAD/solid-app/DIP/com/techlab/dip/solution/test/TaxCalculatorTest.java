package com.techlab.dip.solution.test;

import com.techlab.dip.solution.TaxCalculator;
import com.techlab.dip.solution.XMLFileLogger;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator cal = new TaxCalculator(new XMLFileLogger());
		System.out.println(cal.calculateTax(5, 2));
		System.out.println(cal.calculateTax(0, 0));
	}

}
