package com.techalb.singleton.test;

import com.techlab.singleton.DataService1;

public class SingletonTest {
	public static void main(String[] args) {
		DataService1 s1 = DataService1.getInstance();
		DataService1 s2 = DataService1.getInstance();

		s1.doSomething();
		s2.doSomething();

	}

}
