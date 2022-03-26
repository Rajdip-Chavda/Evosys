class fal
{
	public static void main(String args[])
	{
	double gallons,liters;
	int counter;
	counter=0;
	
	for(gallons=1;gallons<=100;gallons++)
	{
		liters=gallons*3.7854; //convert to liters
		System.out.println(gallons+ " gallons is "+ liters+ " liters. " );
		counter++;
		if(counter == 10)
		{
			System.out.println();
			counter=0;
		}
	}
	}
}

class sound
{
	public static void main(String args[])
	{
		double dist;
		dist=7.2*1100;
		System.out.println("the lightning is " +dist+ " feet away.");
	}
}

class fdemo
{
	int x;
	fdemo(int i)
	{
		x=i;
	}
	protected void finalize()
	{
		System.out.println("finalizing "+ x);
	}
	void generator(int i)
	{
		fdemo o=new fdemo(i);
	}
}
class finalize
{
	public static void main(String args[])
	{
		int count;
		fdemo ob=new fdemo(0);
		for(count=1;count<100000;count++)
		{
			ob.generator(count);
		}
		System.out.println(count);
	}
}