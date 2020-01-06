package com.techlab.ttt;

public class CellIsAlredyMarkedException extends Exception {
	public CellIsAlredyMarkedException() {
		super("Cell is already marked");
	}
}
