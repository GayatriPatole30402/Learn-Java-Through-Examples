package com.sit.SerializationDemo;

import java.io.Serializable;


//if u want object of this class be serializable then you have to implement serializable interface
public class Student implements Serializable {

	/**
	 * 
	 */
	
	//serialVersionUID is a unique identifier used in Java serialization to verify 
	//that a deserialized object matches the class version. 
	//If it’s mismatched, deserialization fails with an InvalidClassException.
	private static final long serialVersionUID = 1L;
	
	//fields or variables
	String name;
	int age;
	String address;
	
	transient int x;
	
	

	//Paramterized Constructor
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

//	//Default Constructor
//	public Student() {
//		super();
//		
//	}

	//Getter and Setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	//To String 
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + "]";
	}

	
	

}
