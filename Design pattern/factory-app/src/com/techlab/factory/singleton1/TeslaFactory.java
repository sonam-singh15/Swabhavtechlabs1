package com.techlab.factory.singleton1;

public class TeslaFactory implements IAutomobileFactory {

	private static TeslaFactory instance;

	private TeslaFactory() {
	}

	public static TeslaFactory getInstance() {
		if (instance == null)
			instance = new TeslaFactory();
		return instance;
	}

	@Override
	public IAutomobile manufacturing() {
		return new Tesla();
	}
}
