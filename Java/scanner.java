import java.util.Scanner;
class scanner
{
	public static void main(String args[])
	{
		System.out.println("scanner class");
		Scanner input = new Scanner(System.in);		
		System.out.println("enter value:");
		int value = input.nextInt();
		System.out.println("the value is :"+ value);
	}
}