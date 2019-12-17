package com.techlab.ocp.test;

import com.techlab.ocp.FestivalType;
import com.techlab.ocp.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit deposits = new FixedDeposit(101, "sonam", 10000, 2, FestivalType.DIWALI);
		System.out.println(deposits.calculateSimpleinterest());

	}

}
