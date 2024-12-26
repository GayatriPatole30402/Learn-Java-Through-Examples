package com.sit.JDBCDemo;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		// creating the connection
		
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="root";
		
		try
		{
			//1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Establish a connection 
			Connection con=DriverManager.getConnection(url,username,password);
			
			//3. create a statement
			Statement stmt=con.createStatement();
			
			//4. Excecute a query
			ResultSet rs=stmt.executeQuery("select * from users");
			
			//5. process the results
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
