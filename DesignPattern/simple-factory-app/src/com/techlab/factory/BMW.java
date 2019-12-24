package com.techlab.factory;

 class BMW implements IAutomobile {

	@Override
	public void start() {
		System.out.println(" BMW Service started");
	}

	@Override
	public void stop() {
		System.out.println(" BMW Service stoped");
	}

}
