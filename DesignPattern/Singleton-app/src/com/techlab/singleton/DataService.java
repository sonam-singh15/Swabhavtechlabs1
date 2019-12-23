package com.techlab.singleton;

public class DataService {

	public DataService() {
		System.out.println("Service has started");
	}

	public void doSomething() {
		System.out.println("Service id is " + this.hashCode());
	}

}
