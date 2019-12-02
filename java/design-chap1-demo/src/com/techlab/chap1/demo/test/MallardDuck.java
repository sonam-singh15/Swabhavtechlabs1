package com.techlab.chap1.demo.test;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackbehaviour = new Quack();
		flybehaviour = new FlywithWings();
	}

	public void display() {
		System.out.println("I am Mallarduck");
	}

}
