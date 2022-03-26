class all_loops
{
	public static void main(String args[])
	{
		System.out.println("the all loops are there \n three types of loop \n 1.for loop \n 2.while loop \n 3.do_while loop");
		
		System.out.println("\nfor loop");
		int i=0,n=10;
		for(i=0;i<n;i++)
		{
			System.out.println("for loop index :" + i);
		}
		i=0;
		System.out.println("\nwhile loop");
		while(i<n)
		{
			System.out.println("while loop index :" + i++);
			//i++;
		}
		System.out.println("\ndo while loop");
		i=0;
		do
		{
			System.out.println("do_while loop index :" + i++);
			//i++;
		}while(i<10);
	}
}