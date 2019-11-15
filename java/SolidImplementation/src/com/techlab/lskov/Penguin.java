package com.techlab.lskov;

public class Penguin extends Bird {

	public Penguin() {
		super.setFlyable(false);
		System.out.println("cant fly");
	}

	@Override
	public void fly() {
		// System.out.println("I'm flying high, across the mountain !");
	}

}
