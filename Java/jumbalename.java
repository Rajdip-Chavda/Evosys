import java.io.IOException;

public class jumbalename implements Runnable
{
	public jumbalename(String firstname,String secendname,long delay)
	{
		this.firstname=firstname;
		this.secendname=secendname;
		aWhile=delay;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(firstname);
				Thread.sleep(aWhile);
				System.out.println(secendname+"\n");
			}
		}
		catch(InterruptedException e)
		{
			system.out.println(firstname+secendname+e);
		}
	}
	public static void main(String args[])
	{
		Thread first =new Thread(new jumbalename("rajdip","chavda",200L));
		Thread secend =new Thread(new jumbalename("abhiraj","makwana",300L));
		Thread third =new Thread(new jumbalename("prajval","rai",500L));
		
		first.setDaemon(true);
		secend.setDaemon(true);
		third.setDaemon(true);
		
		System.out.println("press enter when you have had enough...\n");

		first.start();
		secend.start();
		third.start();
		
		try
		{
			System.in.read();
			System.out.println("Enter pressed...\n");
		}
		
	}
}