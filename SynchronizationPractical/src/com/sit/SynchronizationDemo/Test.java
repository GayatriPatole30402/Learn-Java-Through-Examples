package com.sit.SynchronizationDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathUtil obj=new MathUtil();
		
		Thread1 t1=new Thread1(obj);
		Thread t2=new Thread(new Thread2(obj));
		
		t1.start();
		t2.start();

	}

}
