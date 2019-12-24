package com.techlab.factory;

public class AutoMobileFactory {

	public IAutomobile make(Autotype type) {
		return new IAutomobile() {

			@Override
			public void stop() {
				System.out.println(" BMW Service started");
			}

			@Override
			public void start() {
				System.out.println(" BMW Service stoped");
			}
		};
	}

}
