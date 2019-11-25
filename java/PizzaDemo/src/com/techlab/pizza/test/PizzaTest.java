package com.techlab.pizza.test;

import com.techlab.pizza.ChicagoPizzaStore;
import com.techlab.pizza.Pizza;
import com.techlab.pizza.PizzaStore;

public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}
}
