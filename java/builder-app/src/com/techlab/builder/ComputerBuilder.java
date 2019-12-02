package com.techlab.builder;

public class ComputerBuilder {

	String HDD;
	String RAM;

	boolean isBluetoothEnabled;

	public ComputerBuilder(String hdd, String ram) {
		this.HDD = hdd;
		this.RAM = ram;
	}

	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}

	public Computer build() {
		return new Computer(this);
	}

}
