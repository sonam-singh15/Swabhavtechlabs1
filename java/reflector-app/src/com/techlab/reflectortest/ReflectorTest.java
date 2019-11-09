package com.techlab.reflectortest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.techlab.reflector.Reflector;

public class ReflectorTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Reflector r = new Reflector(Object.class);

		Class c = Object.class;
		r.printGetInfo(c);
		System.out.println();

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
		String constructorName = c1.getName();
		System.out.println("constructor = " + constructorName);
		r.printMethoInfo(c);
		System.out.println();
		
		

	}

}
