package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountToStringTest {
	public static void main(String[] args) {
		Account a = new Account("101", "sonam", 5000);

		System.out.println(a);

		System.out.println(" ");

		System.out.println(a.toString1());

	}

}
