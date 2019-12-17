package com.techlab.icp.solution.test;

import com.techlab.icp.solution.IEat;
import com.techlab.icp.solution.IWorkEat;
import com.techlab.icp.violation.Manager;
import com.techlab.icp.violation.Robot;

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atCoffeeShop(m);

		atTheWorkStation(m);

		atTheWorkStation(r);
	}

	static void atTheWorkStation(IWorkEat w) {
		System.out.println("At the workstation :- \n");
		w.startWork();
		w.stopWork();
	}

	static void atCoffeeShop(IEat e) {
		System.out.println("At the coffeshop  :- \n");
		e.startEat();
		e.stopEat();

	}

}
