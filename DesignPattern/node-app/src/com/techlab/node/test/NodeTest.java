package com.techlab.node.test;

import com.techlab.node.Node;

public class NodeTest {
	public static void main(String[] args) {

		Node<Integer> n1 = new Node<Integer>();
		Node<Integer> n2 = new Node<Integer>();
		Node<Integer> n3 = new Node<Integer>();

		n1.setData(10);
		n1.setNext(n2);

		n2.setData(20);
		n2.setNext(n3);

		n3.setData(30);

		printInfo(n1);

		// printInfo(n2);

	}

	static void printInfo(Node node) {
		while (node.getNext() != null) {
			System.out.println(node.getData());
			node = node.getNext();

		}
		System.out.println(node.getData());

	}
}
