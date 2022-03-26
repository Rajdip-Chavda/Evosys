import java.util.Scanner;
public class binary_addition
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Binary no1 : ");
		int n1 = scan.nextInt();
		System.out.println("Enter Binary no2 : ");
		int n2 = scan.nextInt();
		Integer no1 = Integer.parseInt(String.valueOf(n1), 2);
		Integer no2 = Integer.parseInt(String.valueOf(n2), 2);
		System.out.println(Integer.toBinaryString(no1 + no2));
		System.out.println();
		scan.close();
	}
}
