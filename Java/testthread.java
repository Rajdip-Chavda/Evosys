class multithread
{
	public void printcount();
	{
		try
		{
			for(int i=5;i<0;i--)
			{
				System.out.println("counter --- "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("thread interrupted");
		}
	}
}
class thread extends multithread
{
	private Thread t;
	private String threadName;
	Multithread Mt;
	thread(STring name,multithread mt)
	{
		threadName=name;
		Mt=mt;
	}
	public void run()
	{
		Mt.printcount();
		System.out.println("thread "+threadName+"exiting.");
	}
	public void start()
	{
		System.out.println("String "+threadName);
		if(t==null)
		{
			t=new thread(this.threadName);
			t.start();
		}
	}
}
public class testthread
{
	public static void main(String args[])
	{
		multithread Mt=new Multithread();
		thread t=new thread("thread-1",Mt);
		thread t1=new thread("thread-2",Mt);
		t.start();
		t1.start();
		
		try
		{
			t.join();
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
	}
}