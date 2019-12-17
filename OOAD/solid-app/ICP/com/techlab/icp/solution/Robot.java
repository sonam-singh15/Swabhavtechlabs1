package com.techlab.icp.solution;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot stops working");
	}

}
