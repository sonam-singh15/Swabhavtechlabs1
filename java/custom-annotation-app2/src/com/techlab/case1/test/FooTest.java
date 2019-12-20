package com.techlab.case1.test;

<<<<<<< HEAD
=======
import java.lang.annotation.Annotation;
>>>>>>> f4b6fa4727e80096992a39c1ab283404b6f145d1
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlab.case1.Foo;
import com.techlab.case1.RequireRefacatoring;

public class FooTest {
	public static int annocount = 0;
	static int i = 0;

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
<<<<<<< HEAD

=======
>>>>>>> f4b6fa4727e80096992a39c1ab283404b6f145d1
		Foo obj = new Foo();
		Class<? extends Foo> cls = obj.getClass();
		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			if (m.getDeclaredAnnotation(RequireRefacatoring.class) != null) {

<<<<<<< HEAD
		for (Method m : methods) {
			if (m.isAnnotationPresent(RequireRefacatoring.class)) {
				annocount++;
				System.out.println("Method name:- " + m.getName());
			}

=======
				i++;
			}
			System.out.println("Annoted Methods: ");
			System.out.println(m.getName() + "count" + i);
>>>>>>> f4b6fa4727e80096992a39c1ab283404b6f145d1
		}
		System.out.println("annotation:- " + annocount);

	}
}