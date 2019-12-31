package com.techalb.composite.test;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private String name;
	private List<IStorageItem> children;

	public Folder(String name) {
		this.name = name;
		this.children = new ArrayList<IStorageItem>();
	}

	public void addStorageItem(IStorageItem item) {
		this.children.add(item);
	}

	@Override
	public void display(String leadingSpace) {
		if (leadingSpace == null)
			leadingSpace = "";
		System.out.printf("%s%s\n", leadingSpace, this.name);
		leadingSpace += "--";
		for (IStorageItem item : children)
			item.display(leadingSpace);
	}
}