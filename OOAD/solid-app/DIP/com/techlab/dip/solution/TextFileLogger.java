package com.techlab.dip.solution;

public class TextFileLogger implements ILoggable {

	@Override
	public void log(String log) {
		System.out.println("Message is" + log);
	}

}
