package com.techlab.decorator;

public class OilChange extends BikeServices {

	public OilChange(IBikeService svc) {
		super(svc);
	}

	public String getDescription() {
		return svc.getDescription() + " + Changing oil ";
	}

	public int getCost() {
		return svc.getCost() + 300;

	}

}
