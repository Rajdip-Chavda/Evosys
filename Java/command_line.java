class command_line
{
	public static void main(String args[])
	{
		System.out.println("the command line argument");
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		double a = args[0];
		double b = args[1];
		
		double c = a * b;
		System.out.println("the multiple value is :" + c);
	}
}