package com.techlab.dog;

import java.util.Timer;
import java.util.TimerTask;

public class Dog {
	private boolean open;
	private Bark allowedbark;

	public Dog() {
		this.open = false;
	}

	public Bark getAllowedBark() {
		return allowedbark;
	}

	public void setAllowedBark(Bark bark) {
		this.allowedbark = bark;
	}

	public void open() {
		System.out.println("Door is open....");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				close();
				timer.cancel();

			}
		}, 3000);
	}

	public void close() {
		System.out.println("Door is close.....");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
