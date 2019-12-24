package com.techlab.factory.singleton1;

public class BMWFactory implements IAutoFactory {

	private static BMWFactory instance;

	private BMWFactory() {
	}

	public static BMWFactory getInstance() {
		if (instance == null)
			instance = new BMWFactory();
		return instance;
	}

	@Override
	public IAutomobile make() {
		return new BMW();
	}
}