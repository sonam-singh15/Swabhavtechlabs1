package com.techlab.dip.solution;

public class XMLFileLogger implements ILoggable {

	@Override
	public void log(String log) {
		System.out.println("Message is" + log);
	}

}
