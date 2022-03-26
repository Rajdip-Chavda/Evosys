//demostrate method overloading

class overload
	{
	public static void main(String args[])
		{
		overloaddemo ob=new overloaddemo();
		double result;
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result=ob.test(123.25);
		System.out.println("result of ob.test(123.25:"+result);
	}
}

class overloaddemo
{
	void test()
	{
		System.out.println("no parameters");
	}
	void test(int a)
	{
		System.out.println("a:"+a);
	}
	void test(int a,int b)
	{
		System.out.println("a and b "+ a + "" + b);
	}
	double test(double a)
	{
		System.out.println("double :"+a);
		return a*a;
	}
}