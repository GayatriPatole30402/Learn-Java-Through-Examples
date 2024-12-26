package com.sit.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream inStream = null;
		FileOutputStream outStream = null;

		try {
			inStream = new FileInputStream("C:\\Users\\Admin\\Desktop\\File handling Practical\\Source.txt");
			outStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\File handling Practical\\Dest.txt");

			int content;
			
			//reads a byte at a time until it reaches end of the file
			while((content=inStream.read())!=-1)
			{
				outStream.write((byte) content);
			}
			System.out.println("Successfully written all the content");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(inStream!=null)
			{
				inStream.close();
			}
			if(outStream!=null)
			{
				outStream.close();
			}
		}

	}

}
