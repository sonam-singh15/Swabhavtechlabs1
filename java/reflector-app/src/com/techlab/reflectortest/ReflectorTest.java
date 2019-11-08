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

		r.printMethoInfo(c);
		System.out.println();
		
		

	}

}
