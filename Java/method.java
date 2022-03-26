//method overloding
class bank
{
	double getdata()
	{
		return 5;
	}
}
class sbi extends bank
{
	double getdata()
	{
		return 6;
	}
}
class dena extends bank
{
	double getdata()
	{
		return 7;
	}
}
class bob extends bank
{
	double getdata()
	{
		return 8;
	}
}
class main1
{
	public static void main(String args[])
	{
		System.out.println("sbi" + new sbi().getdata());
		System.out.println("dena" + new dena().getdata());
		System.out.println("bob" + new bob().getdata());
	}
}