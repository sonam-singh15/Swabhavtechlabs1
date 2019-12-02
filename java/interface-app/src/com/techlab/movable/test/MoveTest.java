package com.techlab.movable.test;

import com.techlab.movable.Bike;
import com.techlab.movable.Car;
import com.techlab.movable.IMovable;
import com.techlab.movable.Truck;

public class MoveTest {
	public static void main(String[] args) {

		Truck t = new Truck();

		Bike b = new Bike();

		Car c = new Car();

		IMovable[] moveable = { t, b, c };

		startRace(moveable);
	}

	static void startRace(IMovable[] moveable) {
		for (IMovable iMovable : moveable) {
			iMovable.move();
		}

	}
}
