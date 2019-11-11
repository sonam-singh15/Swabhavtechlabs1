package com.techlab.guitar;

public class Guitar {
	private static final Guitar ACOUSTIC = null;
	private String serialno, model;
	private Wood backwood;
	private Wood topwood;
	private Type type;
	private Builder builder;
	private double price;

	public enum Builder {
		FENDER, MARTIN, GIBSON, COLLINGS, PRS;
	}

	public String toString() {
		switch (getType()) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";

		}
		return null;
	}

	public enum Type {
		ACOUSTIC, ELECTRIC;
	}

	public enum Wood {
		INDIAN_ROSEWOOD, BRAZILLIAN_REDWOOD, AUSTRALIAN_REDWOOD;
	}

	public Guitar(String serialno, double price, Builder builder, String model, Type type, Wood topwood,
			Wood backwood) {
		this.serialno = serialno;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topwood = topwood;
		this.backwood = backwood;

	}

	public String getSerialno() {
		return serialno;

	}

	public double getPrice() {
		return price;
	}

	public Builder getbuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public void setCurrentView(Type currentView) {
		this.type = currentView;
	}

	public Wood getTopWood() {
		return topwood;
	}

	public Wood getBackWood() {
		return backwood;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
