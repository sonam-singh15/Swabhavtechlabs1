package com.techlab.dip.test;

import com.techlab.dip.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(0);
		System.out.println(calc.calculateTax(5, 2));
		System.out.println(calc.calculateTax(0, 0));
	}

}
