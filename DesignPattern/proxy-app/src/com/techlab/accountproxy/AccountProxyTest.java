package com.techlab.accountproxy;

import com.techlab.account.proxy.test.AccountProxy;

public class AccountProxyTest {

	public static void main(String[] args) {
		AccountProxy proxy = new AccountProxy("SBI100", "Sonam", 500);
		proxy.deposit(100);
		System.out.println(proxy.getBalance());

	}

}
