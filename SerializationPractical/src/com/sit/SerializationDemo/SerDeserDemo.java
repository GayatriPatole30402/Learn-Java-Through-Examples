package com.sit.SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {

	public static void main(String[] args) {
		Student student=new Student("Gayatri",22,"Pune");
		student.setX(10);

		String filename="C:/Users/Admin/Desktop//test.txt";
		FileOutputStream fileout=null;
		ObjectOutputStream objout=null;
		
		//serialiazation
		
		try
		{
			fileout= new FileOutputStream(filename);
			objout = new ObjectOutputStream(fileout);
			
			objout.writeObject(student);
			
			
			fileout.close();
			objout.close();
			
			System.out.println("Object has been serializaed!!!\n"+ student);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("IO Exception is caught");
		}
		
		//deserilization
		FileInputStream filein=null;
		ObjectInputStream objin=null;
		
		try
		{
			filein=new FileInputStream(filename);
			objin=new ObjectInputStream(filein);
			
			Student s=(Student)objin.readObject();
			
			System.out.println("Object has been deserialized!!!\n"+s);
			System.out.println("The deserialized value of x is :-"+s.getX());
			
			filein.close();
			objin.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("IO Exception caught");
		}
	}

}
