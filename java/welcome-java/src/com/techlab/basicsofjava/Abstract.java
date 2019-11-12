package com.techlab.basicsofjava;

public abstract class Abstract {
	abstract int getRateOfInterest();
}

class SBI extends Abstract {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Abstract {
	int getRateOfInterest() {
		return 8;
	}
}

class TestBank {
	public static void main(String args[]) {
		Abstract b;
		b = new SBI();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	}
}
