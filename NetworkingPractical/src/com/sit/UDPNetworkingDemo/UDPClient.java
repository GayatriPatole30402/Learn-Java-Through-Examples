package com.sit.UDPNetworkingDemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		
		try
		{
			//step 1:create a DatagramSocket to send Data
			DatagramSocket socket=new DatagramSocket();
			String msg="Hello UDP Server!!!";
			byte[] buffer=msg.getBytes();
			
			
			//step 2: Define server address and port
			InetAddress address=InetAddress.getByName("localhost");
			
			//step 3:create a DatagramPacket to send to Data
			DatagramPacket packet=new DatagramPacket(buffer, buffer.length, address,5000);
			
			//step 4:Send the packet to server
			socket.send(packet);
			
			//step 5:Close the connection
			socket.close();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
