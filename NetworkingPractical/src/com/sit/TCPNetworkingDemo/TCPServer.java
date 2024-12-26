package com.sit.TCPNetworkingDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			//step 1: Create a server socket to listen for client connection
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server is waiting for a connection......");
			
			//step 2: Accept the connection from client
			Socket socket=serverSocket.accept();	
			System.out.println("Client , Connected..");
			
			//step 3: create input and output streams for communications
			DataInputStream dis=new DataInputStream(socket.getInputStream());
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			
			//step 4:read the client's message
			String clientmsg= dis.readUTF();
			System.out.println("Client :"+clientmsg);
			
			//step 5: Send the response to the client
			dos.writeUTF("Hello From Server!");
			
			//step 6: 
			socket.close();
			serverSocket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
