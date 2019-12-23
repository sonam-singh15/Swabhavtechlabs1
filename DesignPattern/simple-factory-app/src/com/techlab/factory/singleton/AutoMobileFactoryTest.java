package com.techlab.factory.singleton;

import com.techlab.factory.AutoMobileFactory;
import com.techlab.factory.Autotype;
import com.techlab.factory.IAutomobile;
import com.techlab.factory.singleton1.IAutoFactory;
import com.techlab.factory.singleton1.TeslaFactory;

public class AutoMobileFactoryTest {
	public static void main(String[] args) {
		IAutoFactory factory = TeslaFactory.getInstance();
		com.techlab.factory.singleton1.IAutomobile auto = factory.make();
		auto.start();
	}

}
