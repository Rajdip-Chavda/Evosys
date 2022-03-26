class parseint
{
	public static void main(String args[])
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("Addition :"+add);
		System.out.println("Subtraction :"+sub);
		System.out.println("Multiplication :"+mul);
		System.out.println("Division :"+div);
		System.out.println("Modules :"+mod);
		//System.out.println("sum is :" +(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
	}
}