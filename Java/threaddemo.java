class myclass extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+" value "+i);
		}
		try
		{
			Thread.sleep(0);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class demo
{
	public static void main(String args[])
	{
		myclass m1=new myclass();
		m1.start();
		
		myclass m2=new myclass();
		m2.start();
		
		myclass m3=new myclass();
		m3.start();
	}
}