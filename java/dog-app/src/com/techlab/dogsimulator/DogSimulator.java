package com.techlab.dogsimulator;

import com.techlab.dog.BarkRecognizer;
import com.techlab.dog.Dog;
import com.techlab.dog.Remote;

public class DogSimulator {
	public static void main(String[] args) {
		Dog door = new Dog();
		door.setAllowedBark("Woof");
		System.out.println(door.getAllowedBark());

		BarkRecognizer bark = new BarkRecognizer(door);
		Remote remote = new Remote();

		System.out.println("Fido starts barking");
		bark.recognize("oof");

		System.out.println("fido has gone outside");

		System.out.println("fido all done");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("Fido starts barking");
		bark.recognize("Woof");

		System.out.println("fido back inside");
	}

}
