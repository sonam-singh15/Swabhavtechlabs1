package com.techlab.reflector;

import java.lang.reflect.Method;

public class Reflector {

	public Reflector(Class c) {
		String className = c.getName();
		System.out.println("The name of class is " + className);

	}

	public void printMethoInfo(Class c) {
		Method[] methods = c.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());
		}
	}

	public void printGetInfo(Class c) {
		Method[] methods = c.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());
			if (method.getName().startsWith("get"))
				System.out.println("getter method");
		}
	}

	public void printSetInfo(Class c) {
		Method[] methods = c.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());
			if (method.getName().startsWith("set"))
				System.out.println("setter method");

		}

	}

}
