package com.techlab.case1.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlab.case1.Foo;
import com.techlab.case1.Test;

public class FooTest {
	public static int passedCount = 0;
	public static int failedCount = 0;
	public static int nooftestcases = 0;

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Foo obj = new Foo();
		Class<? extends Foo> cls = obj.getClass();
		Method[] methods = cls.getMethods();

		for (Method m : methods) {
			if (m.isAnnotationPresent(Test.class)) {
				if ((boolean) m.invoke(obj, null)) {
					passedCount++;
					nooftestcases++;
				} else if (!(boolean) m.invoke(obj, null)) {
					failedCount++;
					nooftestcases++;
				}
			}
		}
		System.out.println("Passed:- " + passedCount);
		System.out.println("failed:- " + failedCount);
		System.out.println("Total test cases: -" + nooftestcases);
	}
}
