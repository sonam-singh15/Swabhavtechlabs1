package com.techlab.factory.test;

import com.techlab.factory.AutoMobileFactory;
import com.techlab.factory.Autotype;
import com.techlab.factory.IAutomobile;

public class AutoMobileFactoryTest {
	public static void main(String[] args) {
		AutoMobileFactory factory = new AutoMobileFactory();

		IAutomobile automobile = factory.make(Autotype.BMW);

		System.out.println(automobile.getClass());

		automobile.start();

		automobile.stop();
	}

}
