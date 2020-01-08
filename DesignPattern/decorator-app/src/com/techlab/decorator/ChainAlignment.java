package com.techlab.decorator;

public class ChainAlignment extends BikeServices {

	public ChainAlignment(IBikeService svc) {
		super(svc);
	}

	public String getDescription() {
		return svc.getDescription() + " + Doing chain Alignment ";

	}

	public int getCost() {
		return svc.getCost() + 150;

	}

}
