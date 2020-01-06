package com.techlab.observer.test;

import com.techlab.observer.Account;
import com.techlab.observer.EmailObserver;
import com.techlab.observer.SmsObserver;

public class AccountTest {

	public static void main(String[] args) {

		Account acc1 = new Account(101, "Sonam", 5000, "sonam@gmail.com", 945793549);

		acc1.addObserver(new SmsObserver());
		acc1.addObserver(new EmailObserver());

		// acc1.withdraw(1000);
		acc1.deposit(1000);

	}

}
