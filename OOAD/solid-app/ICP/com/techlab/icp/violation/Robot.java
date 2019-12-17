package com.techlab.icp.violation;

import com.techlab.icp.solution.IEat;
import com.techlab.icp.solution.IWorkEat;

public class Robot implements IWorker, IEat, IWorkEat {

	@Override
	public void startWork() {
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stops working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException(); // False promise
	}

	@Override
	public void stopEat() {
		throw new RuntimeException(); // False promise
	}

}
