package basicoprations;
import java.util.Scanner;
class student1 implements maths
{
	@Override
	public void add()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter any two integer value to perform addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Addition is :"+s);
	}
	@Override
	public void sub()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter any two integer value to perform subtraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Subtraction is :"+s);
	}
	@Override
	public void mul()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter any two integer value to perform multipication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("multipication is :"+s);
	}
	@Override
	public void div()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter any two integer value to perform divition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("divition is :"+s);
	}
	public static void main(String args[])
	{
		student1 std=new student1();
		std.add();
		std.sub();
		std.mul();
		std.div();
	}
}