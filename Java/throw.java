class throw1
{
	void demoproc() throws ArrayIndexOutOfBoundsException
	{
		int a[]={99};
		a[5]=100;
	}
}
class throwdemo2
{
	public static void main(String arg[])
	{
		try
		{
			throw1 th1=new throw1();
			th1.demoproc();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("inside main");
		}
	}
}