package com.sit.genericDemo;

public class SingleGenericHolder<T> {

	T obj;

	// Parameterized Con
	public SingleGenericHolder(T obj) {
		super();
		this.obj = obj;
	}

	// Default Con
	public SingleGenericHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Getter method
	public T getObj() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleGenericHolder<Integer> iobj = new SingleGenericHolder<>(10);
		System.out.println(iobj.getObj());

		SingleGenericHolder<String> sobj = new SingleGenericHolder<>("Gayatri");
		System.out.println(sobj.getObj());
	}

}
