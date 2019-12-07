package com.techlab.case1.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.case1.Foo;
import com.techlab.case1.RequireRefacatoring;

public class FooTest {
	public static int annocount = 0;

	public static void main(String[] args) {
		Foo obj = new Foo();
		Class<? extends Foo> cls = obj.getClass();
		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			if (method.getAnnotations().equals("RequireRefacatoring")) {
				annocount++;
			}
			System.out.println("methods" + method.getName() + " " + annocount);
		}
	}
}
