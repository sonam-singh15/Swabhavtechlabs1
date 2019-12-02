package com.techlab.adapter;

public class BirdAdapter implements Toyduck {

	Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
	}
}
