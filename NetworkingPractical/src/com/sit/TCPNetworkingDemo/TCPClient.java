package com.sit.TCPNetworkingDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//step 1: Connect to Server
			Socket socket=new Socket("localhost",5000);
			
			//step 2: create input and output stream for communication
			DataInputStream dis=new DataInputStream(socket.getInputStream());
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			
			//step 3: Send message to server
			dos.writeUTF("Good evening from Client....");
			
			//step 4: read the server message
			String msg=dis.readUTF();
			System.out.println("Server: "+msg);
			
			//step 5: closing the connection
			socket.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
