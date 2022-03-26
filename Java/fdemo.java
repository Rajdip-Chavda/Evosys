class fdemo
{
	int x;
	fdemo(int i)
	{
		x=i;
	}
	protected void finalize()	
	{
		System.out.println("Finalizaing "+x);
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
	}
}