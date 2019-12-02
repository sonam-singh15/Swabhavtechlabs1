package com.techlab.adapter.test;

import com.techlab.adapter.BirdAdapter;
import com.techlab.adapter.Sparrow;
import com.techlab.adapter.Toyduck;

public class BirdTest {
	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();

		Toyduck birdAdapter = new BirdAdapter(sparrow);

		System.out.println("Sparrow...");
		sparrow.fly();
		sparrow.makeSound();

		System.out.println("BirdAdapter...");
		birdAdapter.squeak();
	}
}
