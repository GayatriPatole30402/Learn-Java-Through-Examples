package com.sit.AnnotationDemo;

import java.lang.reflect.Method;

public class MyClass {

	//using custom annotation here
	@MyCustomAnnotation(value=10)
	public void sayHello()
	{
		System.out.println("Executing my custom annotation");
	}

	
	public static void main(String[] args) throws Exception {
		//creating object of class	
		MyClass obj=new MyClass();
		
		//calling sayHello method explicitly through object
		obj.sayHello();
		
		//obj.getClass(): Retrieves the runtime class of the object obj (MyClass in this case).
		//getMethod("sayHello"): Uses reflection to get the Method object representing the sayHello method.
		Method methodval=obj.getClass().getMethod("sayHello");
		
		//Checks if the method sayHello is annotated with @MyCustomAnnotation.
		//If present, it retrieves the annotation instance
		MyCustomAnnotation a=methodval.getAnnotation(MyCustomAnnotation.class);
		
		//Calls the value property of the @MyCustomAnnotation annotation,
		//which returns 10 (the value assigned to the annotation when applied to sayHello).
		System.out.println("Value is : "+a.value());
		
		
	}

}
