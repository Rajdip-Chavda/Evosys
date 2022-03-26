import java.util.Scanner;
class assert1
{
	public static void main(String args[])
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter your age:");
		int value=n.nextInt();
		assert value>=18:"not valid";
		System.out.println("value is:"+value);
	}
}
