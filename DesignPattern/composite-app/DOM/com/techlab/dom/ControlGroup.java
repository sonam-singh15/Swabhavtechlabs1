package com.techlab.dom;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IDomElement {
	private String name;
	private List<IDomElement> children;

	public ControlGroup(String name) {
		this.name = name;
		this.children = new ArrayList<IDomElement>();
	}

	public String getName() {
		return name;
	}

	public void addDomElement(IDomElement element) {
		this.children.add(element);
	}

	public List<IDomElement> getChildren() {
		return this.children;
	}

	@Override
	public String parse() {
		StringBuilder builder = new StringBuilder();
		builder.append('<');
		builder.append(this.name);
		builder.append(">\n");

		for (IDomElement element : children) {
			builder.append(element.parse());
		}
		builder.append("</");
		builder.append(this.name);
		builder.append(">");

		return builder.toString();
	}
}
