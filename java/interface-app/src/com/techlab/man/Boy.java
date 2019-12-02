package com.techlab.man;

public class Boy implements ISocializable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("I am crying");
	}

	@Override
	public void laugh() {
		System.out.println("I am laughing");
	}

	@Override
	public void wish() {
		System.out.println(" Boy's Best Wishes");
	}

	@Override
	public void depart() {
		System.out.println(" Boy Dont Want To Wish");

	}

}
