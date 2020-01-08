package com.techlab.adapter;

public interface IQueue<T> extends Iterable<T> {

	void enqueue(T item);

	T dequeue();

	int count();

}
