package com.techlab.icp.violation;

import com.techlab.icp.solution.IEat;
import com.techlab.icp.solution.IWorkEat;

public class Manager implements IWorker, IEat, IWorkEat {

	@Override
	public void startWork() {
		System.out.println("Manager is working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stops working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager is Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stops Eating");
	}

}
