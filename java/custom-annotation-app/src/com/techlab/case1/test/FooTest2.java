package com.techlab.case1.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.case1.Foo;

public class FooTest2 {

	public static void main(String[] args) {
		Foo obj = new Foo();
		Class<?> cls = obj.getClass();
		Method[] methods = cls.getMethods();
		for (int m = 0; m < methods.length; m++) {
			Annotation[] annotations = methods[m].getAnnotations();
			System.out.println("Annotation count" + annotations.length);
			System.out.println("Method name:" + methods[m]);
		}

	}

}
