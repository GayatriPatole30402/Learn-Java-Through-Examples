package com.sit.ThreadDemo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++ )
		{
			Thread1 thread1=new Thread1();
			thread1.start();
			
			Thread thread=new Thread(new Thread2());
			thread.start();
		}

	}

}
