class Q
{
	int n;
	boolean flag=false;
	synchronized void put(int n)
	{
		if(flag)
		{
			try
			{				
				wait();
			}
			catch(InterruptedException e)
			{ };
		}
		this.n=n;
		System.out.println("Produce :"+n);
		flag=true;
		notify();
	}
	synchronized int get()
	{
		if(! flag)
		{
			try
			{				
				wait();
			}
			catch(InterruptedException e)
			{ };
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer (Q q )
	{
		this.q =q;
		new Thread (this).start( );
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class public_120
{
	public static void main(String args[])
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}
}