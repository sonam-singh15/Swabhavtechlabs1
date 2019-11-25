package com.techlab.facade;

public class HotelMaker {
	private Hotel vegFood;
	private Hotel NonVegFood;
	private Hotel VegNonVegFood;

	public HotelMaker() {
		vegFood = new VegFood();
		NonVegFood = new NonVegFood();
		VegNonVegFood = new VegNonVeg();
	}

	public void orderVeg() {
		vegFood.getMenus();
	}

	public void orderNonVeg() {
		NonVegFood.getMenus();
	}

	public void orderVegOrNonveg() {
		VegNonVegFood.getMenus();
	}
}
