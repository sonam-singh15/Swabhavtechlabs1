package com.techlab.decorator;

public class BasicBikeService implements IBikeService {

	@Override
	public String getDescription() {
		return "Basic bike service has started";
	}

	@Override
	public int getCost() {
		return 350;
	}

}
