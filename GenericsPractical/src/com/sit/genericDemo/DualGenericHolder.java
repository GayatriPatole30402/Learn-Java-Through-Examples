package com.sit.genericDemo;

public class DualGenericHolder<T, U> {

	T obj;
	U obj1;

	// Default Con
	public DualGenericHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Parameterized Con
	public DualGenericHolder(T obj, U obj1) {
		super();
		this.obj = obj;
		this.obj1 = obj1;
	}

//	//Getter Methods
//	public T getObj() {
//		return obj;
//	}
//	
//	public U getObj1() {
//		return obj1;
//	}

	// User-defined method
	public void display() {
		System.out.println(obj);
		System.out.println(obj1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DualGenericHolder<Integer, String> obj = new DualGenericHolder<>(1, "Gayatri");
		obj.display();
		
		DualGenericHolder<Integer, String> obj1 = new DualGenericHolder<>(2, "Rutika");
		obj1.display();


	}

}
