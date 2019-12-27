package com.techlab.factory.test;

import com.techlab.factory.IAutoFactory;
import com.techlab.factory.IAutomobile;
import com.techlab.factory.TeslaFactory;

public class FactoryMethodTest {
	public static void main(String[] args) {
		IAutoFactory factory = TeslaFactory.getInstance();
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();
	}

}
