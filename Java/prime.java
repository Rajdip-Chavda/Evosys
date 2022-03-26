import java.util.Scanner;
class prime
{
	static void checkvalue(int n)
	{
		int i,flag=0,m=0;
		m=n/2;
		/*if(n==0|n==1)
		{
			System.out.println(n + " is not prime number");
		}
		{*/
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " is not prime");
					flag=1;
					break;
				}
			}
		//}
		if(flag==0)
		{
			System.out.println(n + " is Prime");
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("find Prime number program");
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number till you want to search :");
		int value = input.nextInt();
		
		for(int j=0;j<value;j++)
		{
			checkvalue(j);
		}
	}
}