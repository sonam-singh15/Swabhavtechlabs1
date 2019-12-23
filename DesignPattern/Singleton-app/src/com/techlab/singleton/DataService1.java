package com.techlab.singleton;

public class DataService1 {
	private static DataService1 bucket;

	public DataService1() {
		System.out.println("Service has started");
	}

	public static DataService1 getInstance() {
		if (bucket == null)
			bucket = new DataService1();
		return bucket;

	}

	public void doSomething() {
		System.out.println("Service %d is doing something" + this.hashCode());
	}
}
