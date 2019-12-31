package com.techlab.dom;

public class Control implements IDomElement {
	private String name;
	private String attributes;
	private String innerElement;

	public Control(String name, String attributes, String innerElement) {
		this.name = name;
		this.innerElement = innerElement;
		this.attributes = attributes;

	}

	public Control(String name, String innerElement) {
		this(name, innerElement, " ");
	}

	public Control(String name) {
		this(name, " ");
	}

	public String getName() {
		return name;
	}

	public String getAttributes() {
		return attributes;
	}

	public String getInnerElement() {
		return innerElement;
	}

	public void setArributes(String attributes) {
		this.attributes = attributes;
	}

	public void setInnerElement(String innerElement) {
		this.innerElement = innerElement;
	}

	@Override
	public String parse() {
		StringBuilder builder = new StringBuilder();
		builder.append('<');
		builder.append(this.name);

		if (this.attributes.length() > 0)
			builder.append(' ');
		builder.append(attributes);

		builder.append('>');
		builder.append(this.innerElement);

		builder.append("</");
		builder.append(this.name);
		builder.append(">/n");

		return builder.toString();
	}

}
