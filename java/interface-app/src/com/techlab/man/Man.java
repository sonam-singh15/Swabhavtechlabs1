package com.techlab.man;

public class Man implements ISocializable {

	@Override
	public void wish() {
		System.out.println(" Man's Best Wishes");
	}

	@Override
	public void depart() {
		System.out.println(" Man Dont Want To Wish");
	}

}
