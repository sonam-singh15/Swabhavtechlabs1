package com.techlab.employee;

public class Parser implements IParsable {

	IParseAdable container;

	public Parser(IParseAdable container) {
		this.container = container;
	}

	@Override
	public boolean parse(String csv) {
		String[] lines = csv.split(System.getProperty("line.separator"));
		for (String line : lines) {
			String[] values = line.replace("\r", "").split(",");
			container.add((Object[]) values);
		}
		return false;
	}

}
