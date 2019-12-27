package com.techlab.factory.test;

import com.techlab.factory.InjectFactoryConfig;
import com.techlab.factory.IAutoFactory;
import com.techlab.factory.IAutomobile;

public class FactoryConfigTest {
	public static void main(String[] args) {
		InjectFactoryConfig config = new InjectFactoryConfig();

		IAutoFactory factory = config.getFactory();

		System.out.println(factory.getClass().getSimpleName());

		IAutomobile auto = factory.make();

		auto.start();

		auto.stop();

	}

}
