package com.sit.StringHanlingDemo;

import java.util.Arrays;

public class StringHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Gayatri is Studying ";
		String str2="in College";
		
//		
//		//Length() method
//		System.out.println(str1.length());
//		
//		//concat() method
//		String result=str1.concat(str2);
//		System.out.println(result);
//		
//		//format() method
//		String s=String.format("Student name is :"+"%s, and the age is %d","Gayatri",21 );
//		System.out.println(s);
		
//		//CharAt()
//		System.out.println(str1.charAt(0));
//		
//		//equals() method
//		if(str1.equals(str2))
//		{
//			System.out.println("Both strings are equal");
//		}
//		else
//		{
//			System.out.println("Both strings are different");
//		}
		
		//indexOf() method
//		System.out.println(str1.indexOf('G'));
		
		//replace() Method
//		System.out.println(str1.replace('G', 'Z'));
		
		//Split() methods
//		String[] arr=str1.split(" ");
//		Arrays.asList(arr).forEach(s->System.out.println(s));
		
		//substring() method
		String newstr=str1.substring(1,5);
		System.out.println(newstr);
		
		
		
	}

}
