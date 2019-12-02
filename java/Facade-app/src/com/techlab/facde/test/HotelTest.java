package com.techlab.facde.test;

import com.techlab.facade.HotelMaker;

public class HotelTest {
	public static void main(String[] args) {
		HotelMaker m = new HotelMaker();

		m.orderVeg();

		System.out.println();

		m.orderNonVeg();

		System.out.println();

		m.orderVegOrNonveg();
	}
}
