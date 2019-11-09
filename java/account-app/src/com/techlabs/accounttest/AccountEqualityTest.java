package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountEqualityTest {
	public static void main(String[] args) {
		Account acc1 = new Account("101", "abc", 5000);
		Account acc2 = new Account("101", "abc", 5000);

		System.out.println(acc1 == acc1);
		System.out.println(acc2 == acc2);
		System.out.println(acc1 == acc2);
		System.out.println(" ");

		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());
		System.out.println(" ");

		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.equals(acc1));
		System.out.println(acc2.equals(acc2));

	}

}
