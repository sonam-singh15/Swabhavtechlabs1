package com.techlab.case1.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlab.case1.Foo;
import com.techlab.case1.RequireRefacatoring;

public class FooTest {
	public static int annocount = 0;
	static int i = 0;

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo obj = new Foo();
		Class<? extends Foo> cls = obj.getClass();
		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			if (m.getDeclaredAnnotation(RequireRefacatoring.class) != null) {

				i++;
			}
			System.out.println("Annoted Methods: ");
			System.out.println(m.getName() + "count" + i);
		}
	}
}