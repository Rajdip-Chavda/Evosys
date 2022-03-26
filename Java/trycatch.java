class nesttry
{
	public static void main(String arg[])
	{
		try
		{
			int a=arg.length;
			System.out.println("A="+a);
			try
			{
				if(a==1)
				a=a/(a-a);
				if(a==2)
				{
					int c[]={1};
					c[3]=99;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by Zero"+e);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero"+e);
		}
	}
}