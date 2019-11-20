package com.techlab.chap1.demo.test;

public class Duck {
	Flyable flybehaviour;
	Quackable quackbehaviour;

	public Duck() {

	}

	public void performDuck() {
		flybehaviour.fly();
	}

	public void performQuack() {
		quackbehaviour.quack();
	}

	public void quack() {
		System.out.println();
	}

	public void swim() {
		System.out.println();
	}

	public void display() {
		System.out.println();
	}

	public void fly() {
		System.out.println();
	}
}
