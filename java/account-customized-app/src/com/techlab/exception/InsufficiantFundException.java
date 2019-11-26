package com.techlab.exception;

public class InsufficiantFundException extends RuntimeException {
	public Account acc;

	public InsufficiantFundException(Account acc) {
		this.acc = acc;
	}

	@Override
	public String getMessage() {
		String msg = "No fund is remaining";
		return msg;

	}
}
