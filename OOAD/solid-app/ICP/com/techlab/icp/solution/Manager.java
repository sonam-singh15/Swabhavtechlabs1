package com.techlab.icp.solution;

public class Manager implements IWorkEat {

	@Override
	public void startWork() {
		System.out.println("Manager starts working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stops working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager starts working");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager starts working");
	}

}
