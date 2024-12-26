package com.sit.SynchronizationDemo;

public class Thread1 extends Thread{
	
	MathUtil mu;
	
	
	public Thread1(MathUtil mu) {
		super();
		this.mu = mu;
	}



	@Override
	public void run()
	{
		try
		{
			mu.getmultiples(2);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
