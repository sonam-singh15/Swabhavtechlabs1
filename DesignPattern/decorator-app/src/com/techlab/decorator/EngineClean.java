package com.techlab.decorator;

public class EngineClean extends BikeServices {

	public EngineClean(IBikeService svc) {
		super(svc);
	}

	public String getDescription() {
		return svc.getDescription();
	}

	public int getCost() {
		return svc.getCost() + 1000;
	}
}
