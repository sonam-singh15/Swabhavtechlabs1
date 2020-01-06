package com.techlab.observer;

public class EmailObserver implements IBalnceObserver {

	@Override
	public void update(Account acc) {

		System.out.println(" Email:-Hi ,this is to notify that " + acc.getAccno()
				+ " your account balance has changed to " + acc.getBalnce());

	}

}
