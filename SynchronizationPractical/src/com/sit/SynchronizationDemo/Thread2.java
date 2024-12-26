package com.sit.SynchronizationDemo;

public class Thread2 implements Runnable {
	
	MathUtil mu;

	public Thread2(MathUtil mu) {
		super();
		this.mu = mu;
	}
	
	@Override
	public void run()
	{
		try
		{
			mu.getmultiples(3);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
