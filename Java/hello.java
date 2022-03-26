import java.util.Scanner;
class hello
{
	public static void main(String args[])
	{
		System.out.println("hello");
	}
}
class helloname
{
	public static void main(String args[])
	{
		System.out.print("hello "+args[0]);
	}
}
class dynamic
{
	public static void main(String args[])
	{
		for(String name:args)
		{
			System.out.println("hello "+name);
			System.out.println("hello "+args);
		}
	}
}
class jagged
{
	public static void main(String args[])
	{
		int p[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i[]:p)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
class loop
{
	public static void main(String args[])
	{
		int i=0;
		for(i=0;i<10;i++)
		{
			System.out.println(i+" ");
		}
		while(i>0)
		{
			System.out.println(i+" ");
			i--;
		}
		do
		{
			System.out.println(i+" ");
			i++;
		}while(i<=10);
	}
}

class switchcase
{
	public static void main(String args[])
	{
		Scanner n1=new Scanner(System.in);
		System.out.println("Enter value to you have to print :");
		int n=n1.nextInt();
		
		if(n<=5)
		{
			switch(n)
			{
				case 1:
					System.out.println("--> 1");
					break;
				case 2:
					System.out.println("--> 2");
					break;
				case 3:
					System.out.println("--> 3");
					break;
				case 4:
					System.out.println("--> 4");
					break;
				case 5:
					System.out.println("--> 5");
					break;				
			}
		}
		
	}
}
class tryinitialization
{
	static int value[]=new int[10];
	
	static
	{
		System.out.println("running.......");
		for(int i=0;i<value.length;i++)
		{
			value[i]=(int)(100.0*Math.random());
		}
		
	}
	void list()
	{
		System.out.println();
		for(int nvalue:value)
		{
			System.out.print(" "+nvalue);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		tryinitialization example = new tryinitialization();
		System.out.println("\nFirst object:");
		example.list();
		tryinitialization nextexample = new tryinitialization();
		System.out.println("\nSecond object:");
		nextexample.list();
		
	} 
}