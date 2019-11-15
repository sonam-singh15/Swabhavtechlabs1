package com.techlab.lskov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdTest {
	public static void main(String[] args) {
		Bird eagle = new Eagle();
		Bird mallardDuck = new MallardDuck();
		Bird penguin = new Penguin();
		penguin.fly();
		List<Bird> birds = new ArrayList<>(Arrays.asList(eagle, mallardDuck, penguin));

		for (Bird bird1 : birds) {
			if (bird1.getFlyable()) {
				bird1.fly();
			}
		}

	}

}
