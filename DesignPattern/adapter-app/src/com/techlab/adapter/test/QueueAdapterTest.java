package com.techlab.adapter.test;

import com.techlab.adapter.IQueue;
import com.techlab.adapter.QueueAdapter;

public class QueueAdapterTest {
	public static void main(String[] args) {
		IQueue<Integer> q = new QueueAdapter<Integer>();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.println("Elements count:" + q.count());
		System.out.println("Removed element is:" + q.dequeue());

		System.out.println("Elements count:" + q.count());

		System.out.println("elements present in the list are");
		for (Integer elem : q) {
			System.out.println(elem);
		}
	}

}
