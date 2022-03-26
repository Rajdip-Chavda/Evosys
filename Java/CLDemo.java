//program for command line argument usinf for loop , program 3

class CLDemo
{
	public static void main(String args[])
	{
		System.out.println("there are " + args.length + "command-line arguments");
		//System.out.println("they are");
		for(int i=0; i<args.length; i++)
		//System.out.println("args[" + i + "]:" +args[i]);
		System.out.println("hello " + args[i]);
	}
}