package com.techlab.decorator;

public class WaterWash extends BikeServices {

	public WaterWash(IBikeService svc) {
		super(svc);
	}

	public String getdescription() {
		return svc.getDescription() + " Washing with water ";
	}

	public int getCost() {
		return svc.getCost() + 100;
	}

}
