package com.techlab.dip;

public class TaxCalculator {
	int logtype;

	public TaxCalculator(int logtype) {
		this.logtype = logtype;
	}

	public int calculateTax(int amount, int rate) {
		try {
			return amount / rate;
		} catch (Exception e) {
			switch (this.logtype) {
			case 0:
				XmlFileLogger logger = new XmlFileLogger();
				logger.log("error");
				break;
			case 1:
				TextFileLogger loggertxt=new TextFileLogger();
				loggertxt.log("error");
				break;
			}

		}
		return -1;
	}

}
