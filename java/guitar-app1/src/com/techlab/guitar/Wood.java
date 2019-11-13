package com.techlab.guitar;

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazilian Rosewood";
		case MAHOGANY:
			return "Mahogany";
		case MAPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";
		case CEDAR:
			return "Cedar";
		default:
			return "unspecified";
		}
	}
}
