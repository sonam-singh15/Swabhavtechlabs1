package com.techlab.dogsimulator;

import com.techlab.dog.Bark;
import com.techlab.dog.BarkRecognizer;
import com.techlab.dog.Dog;
import com.techlab.dog.Remote;

public class DogSimulator {
	public static void main(String[] args) {
		Dog door = new Dog();
		door.setAllowedBark(new Bark("Woof"));

		BarkRecognizer bark = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Fido starts barking.....");
		bark.recognize(new Bark("Woof"));

		System.out.println("fido has gone outside.....");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("\n but  he is stuck");
		System.out.println("fido all done...");

		System.out.println("A small dog starts barking.");
		bark.recognize(new Bark("Yip"));

		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("\nBruce starts barking.");
		bark.recognize(new Bark("Woof"));

		System.out.println("\nBruce's back inside...");
	}

}
