package com.sit.AutoBoxingDemo;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		// Auto Boxing Demo
		int i=10;
		
		//auto boxing - converting int data type to Integer object
		Integer obj=Integer.valueOf(i);
		System.out.println(obj);
		
		//auto unboxing - convert back Integer object to int datatype
		int i1=obj;
		System.out.println(i1);

	}

}
