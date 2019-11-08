package com.techlab.reflectortest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.techlab.reflector.Reflector;

public class ReflectorTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Class c = Reflector.class;
		String className = c.getName();
		System.out.println("The name of class is " + className);

		Method[] methods = c.getMethods();

		for (Method method : methods) {
			System.out.println("method = " + method.getName());
			if (method.getName().startsWith("get"))
				System.out.println("getter method");
			if (method.getName().startsWith("set"))
				System.out.println("setter method");

		}

		int classModifiers = c.getModifiers();
		System.out.println("modifier is:" + Modifier.isPublic(classModifiers));

		Constructor c1 = c.getConstructor(null);
		String constructorName=c1.getName();
		System.out.println("constructor = " + constructorName);

	}

}
