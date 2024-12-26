package com.sit.regularExpDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regx=".*[a-z][0-9].";
		Pattern pattern=Pattern.compile(regx);
		
		Matcher matcher=pattern.matcher("123abc123");
		boolean matchfound=matcher.find();
		
		if(matchfound)
		{
			System.out.println("Match has been found");
		}
		else
		{
			System.out.println("Match not found");
		}
	

	}

}
