import java.util.*;
import java.util.Scanner;
class triangle
{
	public static void main()
	{
		Scanner input=new Scanner(System.in);
		double no1,no2,no3;
		System.out.println("enter value of degree :");
		no1=input.nextline();
		no2=no1*3.14/100;
		System.out.println("sin "+Math.sin(no2));
		System.out.println("cos "+Math.cos(no2));
		System.out.println("tan "+Math.tan(no2));
	}
}