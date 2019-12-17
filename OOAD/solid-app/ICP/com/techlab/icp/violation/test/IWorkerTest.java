package com.techlab.icp.violation.test;

import com.techlab.icp.violation.IWorker;
import com.techlab.icp.violation.Manager;
import com.techlab.icp.violation.Robot;

public class IWorkerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();

		atTheWorkStation(m);
		atCoffeeShop(m);

		System.out.println();

		atTheWorkStation(r);

		atCoffeeShop(r); // Violation of LSP solid principle //solution is ISP

	}

	static void atTheWorkStation(IWorker w) {
		System.out.println("At the workstation :- \n");
		w.startWork();
		w.stopWork();
	}

	static void atCoffeeShop(IWorker w) {
		System.out.println("At the coffeshop  :- \n");
		w.startEat();
		w.stopEat();

	}
}
