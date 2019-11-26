package com.techlab.adapter;

public class Sparrow implements Bird {

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void makeSound() {
		System.out.println("I am making sound");
	}

}
