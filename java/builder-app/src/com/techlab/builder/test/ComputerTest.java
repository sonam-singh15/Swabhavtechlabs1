package com.techlab.builder.test;

import com.techlab.builder.Computer;
import com.techlab.builder.ComputerBuilder;

public class ComputerTest {
	public static void main(String[] args) {

		ComputerBuilder builder = new ComputerBuilder("abc", "pqr");
		Computer comp = new Computer(builder);
		builder.setBluetoothEnabled(true);
		builder.build();

	}

}
