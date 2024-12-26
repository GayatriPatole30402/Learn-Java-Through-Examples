package com.sit.SynchronizationDemo;

public class MathUtil {
	
	 void getmultiples(int n)
	{
		synchronized (this) {
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				
				try
				{
					Thread.sleep(400);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			
		}
	}

}
