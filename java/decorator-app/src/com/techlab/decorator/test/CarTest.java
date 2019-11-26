package com.techlab.decorator.test;

import com.techlab.decorator.BasicCar;
import com.techlab.decorator.Car;
import com.techlab.decorator.LuxuryCar;
import com.techlab.decorator.SportsCar;

public class CarTest {
	public static void main(String[] args) {
		Car SportsCar = new SportsCar(new BasicCar());
		SportsCar.assemble();

		System.out.println();

		Car LuxuryCar = new LuxuryCar(new BasicCar());
		LuxuryCar.assemble();
	}
}
