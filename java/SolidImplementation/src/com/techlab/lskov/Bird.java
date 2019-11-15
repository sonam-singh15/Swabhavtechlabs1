package com.techlab.lskov;

public abstract class Bird {
	private String name;
	private String location;
	private int flightDistance;
	private boolean flyable = true;

	public boolean getFlyable() {
		return flyable;

	}

	public void setFlyable(boolean flyable) {
		this.flyable = flyable;
	}

	String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getFlightDis() {
		return flightDistance;
	}

	public void setFlightDis(int dist) {
		this.flightDistance = dist;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void fly();

}
