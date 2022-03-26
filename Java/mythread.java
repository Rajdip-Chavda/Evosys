class mythread implements Runnable
{
	String thrdname;
	mythread(String name)
	{
		thrdname=name;
	}
	public void run()
	{
		System.out.println(thrdname + " starting ");
		try
		{
			for(int count=0;count<10;count++)
			{
				Thread.sleep(400);
				System.out.println("in "+thrdname+", count is "+count);
		
			}
		}
		catch(InterruptedException exc)
		{
			System.out.println(thrdname+"interrupted.");
		}
		System.out.println(thrdname+" terminating");
	}
}
class usethread
{
	public static void main(String args[])
	{
		System.out.println("main thread starting");
		
		mythread mt=new mythread("Child #1");
		
		Thread newThrd = new Thread(mt);
		
		newThrd.start();
		
		for(int i=0;i<50;i++)
		{
			System.out.print(".");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException exc)
			{
				System.out.println("main thread interrupted.");
			}
		}
		System.out.println("main thread ending");
	}
}