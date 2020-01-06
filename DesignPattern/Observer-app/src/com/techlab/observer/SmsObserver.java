package com.techlab.observer;

public class SmsObserver implements IBalnceObserver {

	@Override
	public void update(Account acc) {
		System.out.println(" SMS:-this is to notify that " + acc.getAccno() + " Your account balance has changes to: "
				+ acc.getBalnce());
	}

}
