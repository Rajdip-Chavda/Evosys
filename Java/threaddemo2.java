class threadA extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from thread A with i=" + -1*i);
		}
		System.out.println("exiting from thread A...");
	}
}
class threadB extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from thread B with j=" + 2*j);
		}
		System.out.println("exiting from thread B...");
	}
}
class threadC extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{ 
			System.out.println("from thread C with k="+ (2*k-1));
		}
		System.out.println("exiting from thread C...");
	}
}
class threaddemo2
{
	public static void main(String args[])
	{
		threadA a=new threadA();
		threadB b=new threadB();
		threadC c=new threadC();
		a.start();
		b.start();
		c.start();
		System.out.println("....multithreading is over....");
	}
}
