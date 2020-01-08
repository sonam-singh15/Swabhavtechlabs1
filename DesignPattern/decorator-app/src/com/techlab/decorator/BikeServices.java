package com.techlab.decorator;

public class BikeServices implements IBikeService {

	protected IBikeService svc;

	public BikeServices(IBikeService svc) {
		this.svc = svc;
	}

	public String getDescription() {
		return svc.getDescription();
	}

	public int getCost() {
		return svc.getCost();
	}

}
