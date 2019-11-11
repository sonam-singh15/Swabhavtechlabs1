package com.techlab.dog;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private Dog door;

	public Remote() {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("pressing button");
		if (door.isOpen())
			door.close();
		else
			door.open();
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				door.close();

			}
		}, null);
		timer.cancel();
	}
}
