class array
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int b;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("array :"+a[i]);
		}
	}
}