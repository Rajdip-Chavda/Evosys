class sum
{
	public static void main(String args[])
	{
		int no[]={10,20,30,40,50};
		
		int sum=0;
		for(int i : no)
		{
			sum = sum + i;
		}
		System.out.println("sum of array= "+ sum);
	}
}