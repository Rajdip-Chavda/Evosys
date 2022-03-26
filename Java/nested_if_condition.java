class nested_if_condition
{
	public static void main(String args[])
	{
		System.out.println("the nested_if_condition");
		int a,b,c,d;
		a=10;b=10;c=20;d=20;
		
		if(a==b)
		{
			System.out.println("the value of a and b is same");
			if(b==c)
			{
				System.out.println("the value of b and c is same");
			}
			else
			{
				System.out.println("the value of b and c is not same");
			}
		}
		else
		{
			System.out.println("the main else condition");
		}
		
	}
}
