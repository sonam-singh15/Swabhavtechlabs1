package com.techlab.factory.singleton1;

public class AudiFactory implements IAutomobileFactory {

	private static AudiFactory instance;

	private AudiFactory() {
	}

	public static AudiFactory getInstance() {
		if (instance == null)
			instance = new AudiFactory();
		return instance;
	}

	@Override
	public IAutomobile manufacturing() {
		return new Audi();
	}
}
