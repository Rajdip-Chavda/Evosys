import java.util.Scanner;
public class input
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("What is your name ? ");
		String name=in.nextLine();
		System.out.println("How old are you ? ");
		int age=in.nextInt();
		
		System.out.println("Hello "+name+". next year, you will be "+(age+1));
	}
}
