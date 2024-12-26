package com.sit.CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader r=null;
		FileWriter w=null;
		
		try
		{
			r=new FileReader("C:\\Users\\Admin\\Desktop\\File handling Practical\\Source.txt");
			w=new FileWriter("C:\\Users\\Admin\\Desktop\\File handling Practical\\Dest.txt");
			
			int content;
			//reads a byte at a time until it reaches end of the file
			while((content=r.read())!=-1)
			{
				w.write((char) content);
			}
			System.out.println("Successfully written all the content");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			if(r!=null)
			{
				r.close();
			}
			if(w!=null)
			{
				w.close();
			}
		}

	}

}
