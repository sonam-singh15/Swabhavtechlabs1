package com.techalb.singleton.test;

import com.techlab.singleton.DataService;

public class DataServiceTest {
	public static void main(String[] args) {
		DataService service1 = new DataService();

		DataService service2 = new DataService();

		service1.doSomething();
		service2.doSomething();

	}

}
