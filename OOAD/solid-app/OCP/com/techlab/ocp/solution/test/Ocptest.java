package com.techlab.ocp.solution.test;

import com.techlab.ocp.solution.FixedDeposit;
import com.techlab.ocp.solution.NormalRate;

public class Ocptest {
	public static void main(String[] args) {

		FixedDeposit depts = new FixedDeposit(1, "sonam", 100000, 2, new NormalRate());
		System.out.println("simple interest:" + depts.calculateSimpleinterest());
	}

}
