package com.techlab.reflectortest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlab.reflector.Reflector;

public class ReflectorTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Class c = Reflector.class;
		System.out.println("The name of class is " + c.getName());

		Method[] methods = Reflector.class.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());

		}
		Package fieldGetter = Reflector.class.getPackage();
		System.out.println("package = " + fieldGetter.getName());

		Constructor c1 = Reflector.class.getConstructor();
		System.out.println("constructor = " + c1.getName());

	}

}
