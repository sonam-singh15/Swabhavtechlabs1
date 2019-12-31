package com.techlab.dom.test;

import java.io.FileOutputStream;
import java.io.IOException;

import com.techlab.dom.Control;
import com.techlab.dom.ControlGroup;
import com.techlab.dom.IDomElement;

public class DOMTest {

	public static void main(String[] args) {
		IDomElement root = generatelogin();
		String html = root.parse();
		System.out.println(html);
		writeIntoFile("Resource/login.html", html);

	}

	private static IDomElement generatelogin() {

		ControlGroup root = new ControlGroup("div");

		ControlGroup p = new ControlGroup("p");
		Control namespan = new Control("span");
		namespan.setInnerElement("Username");
		Control inputName = new Control("input");
		inputName.setArributes("type=\"text\"");
		p.addDomElement(namespan);
		p.addDomElement(inputName);
		root.addDomElement(p);

		ControlGroup p1 = new ControlGroup("p");
		Control passspan = new Control("span");
		passspan.setInnerElement("Password");
		Control inputName1 = new Control("input");
		inputName1.setArributes("type=\"Password\"");
		p1.addDomElement(passspan);
		p1.addDomElement(inputName1);
		root.addDomElement(p1);

		ControlGroup p2 = new ControlGroup("p");
		Control submitspan = new Control("Submit");
		submitspan.setArributes("type=\"Submit\" value=\" Login\"");
		p2.addDomElement(submitspan);
		root.addDomElement(p2);

		return root;
	}

	private static void writeIntoFile(String filename, String data) {

		try {
			FileOutputStream out = new FileOutputStream(filename);
			out.write(data.getBytes());
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
