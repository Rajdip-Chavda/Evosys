class ticktock
{
	String stare
	
	synchronized void tick(boolean running)
	{
		if(!running)
		{
			state="ticked";
			notify();
			return;
		}
		System.out.println("tick ");
		state="ticked";
		notify();
		try
		{
			while(!state.equals("tocked"))
				wait();
		}
		catch(InterruptedException exe)
		{
			System.out.println("thread interrupted.");
		}
	}
	synchronized void tock(boolean running)
	{
		if(!running)
		{
			state="tocked";
			notify();
			return;
		}
		System.out.println("tock ");
		state="tocked";
		notify();
		try
		{
			while(!state.equals("ticked"))
				wait();
		}
		catch(InterruptedException exe)
		{
			System.out.println("thread interrupted.");
		}
	}
}
class mythread implements runnable
{
	thread thrd;
	ticktock ttOb;
	
	mythread(String name,ticktock tt)
	{
		thrd=new thread(this,name);
		ttOb=tt;
		thrd.start();
	}
	public void run()
	{
		if(thrd.getName().comaraTo("tick")==0)
		{
			for(int i=0;i<5;i++)
				ttOb.tick(true);
			ttOb.tick(false);
		}
		else
		{
			for(int i=0;i<5;i++)
				ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}