package com.sit.NIODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
	public static void main(String[] args) throws IOException {
		// Reading from file
		FileInputStream fin = new FileInputStream("C://Users//Admin//Desktop//File handling Practical//Source.txt");
		FileChannel readChannel = fin.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate(1024);
		int result = readChannel.read(readBuffer);
		System.out.println("File read Successfully :" + result);
		
		
		//writing into file
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\File handling Practical\\Dest.txt");
		FileChannel writeChannel=fout.getChannel();
		ByteBuffer writeBuffer=ByteBuffer.allocate(1024);
		String msg="Hello destination file...";
		writeBuffer.put(msg.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.println("File Written successfully!!");
		
		
		

	}

}
