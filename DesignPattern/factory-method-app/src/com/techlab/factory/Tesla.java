package com.techlab.factory;

class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla Service started");
	}

	@Override
	public void stop() {
		System.out.println("Tesla Service has stopped");
	}

}
