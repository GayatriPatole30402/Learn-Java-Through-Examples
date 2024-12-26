package com.sit.EnumerationDemo;

public class TestEnum {

	public static void main(String[] args) {
		Day d=Day.Tuesday;
		
		
//		if(d==Day.Monday) {
//			System.out.println("Its working day...");
//		}
//		else
//		{
//			System.out.println("Get relaxed");
//		}
		
		for (Day value: Day.values()) {
			System.out.println(value);
			
		}
		
		
	}

}
