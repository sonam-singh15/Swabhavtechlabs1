package com.techlabs.account;

public class InsufficiantFundException extends RuntimeException {
	private Account acc;

	public InsufficiantFundException(Account acc) {
		this.acc = acc;
	}

	@Override
	public String getMessage() {
		String msg = "No fund is remaining";
		return msg;

	}
}
