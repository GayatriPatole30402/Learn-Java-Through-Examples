package com.sit.UDPNetworkingDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
		
		try
		{
			//step 1:create a DatagramSocket to listen on port 5000
			DatagramSocket socket=new DatagramSocket(5000);
			byte[] buffer=new byte[1024];
			
			//step 2:Create a DatagramPacket to recieve data
			DatagramPacket packet=new DatagramPacket(buffer, buffer.length);
			System.out.println("Server is waiting....");
			
			//step 3:Receive the packet from client
			socket.receive(packet);
			
			//step 4:Extract and print the received message
			String msg=new String(packet.getData(),0,packet.getLength());
			System.out.println("Receievd: "+msg);
			
			//step 5:close the connection
			socket.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
