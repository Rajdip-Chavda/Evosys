import java.util.*;
import java.lang.*;
class p1
{
	/*Write a program to print the following pattern :
	****
	***
	**
	*
	
	*/
	public static void main(String args[])
	{
		System.out.println("****\n***\n**\n*");
	}
}

class p2
{
	//Write a program that reads a distance in kilometers from the keyboard and output the distance as miles.
	public static void main(String args[])
	{
		Scanner p2=new Scanner(System.in);
		System.out.println("Enter Value in kilometers :");
		double value=p2.nextDouble();
		double miles=0.621;
		System.out.println("the value of kilometers :"+value);
		System.out.println("the value of miles :"+value*miles);
	}
}

class p3
{
	//Write an application that generates the first 15 numbers in the Fibonacci series and first 15 prime numbers.
	public static void main(String args[])
	{
		Scanner p3=new Scanner(System.in);
		System.out.println("how many term of Fibonacci you want to print: ");
		int value=p3.nextInt();
		int a,b;
		int nextvalue;
		a=0;b=1;
		nextvalue=a+b;
		System.out.println("Fibonacci Series is :");
		System.out.print("0 1");
		for(int i=0;i<=value-3;i++)
		{
			System.out.print(" "+nextvalue);
			a=b;
			b=nextvalue;
			nextvalue=a+b;
		}
	
		System.out.println("\n\n*****************************************\n");
		
		System.out.println("how many term of Prime number you want to print: ");
		int prime=p3.nextInt();
		int count=0,number=0,i=1,j=1;  
		while(number<prime)  
		{  
			j=1;  
			count=0;  
			while(j<=i)  
			{  
				if(i%j==0)  
					count++;  
				j++;   
			}  
			if(count==2)  
			{  
				System.out.printf("%d ",i);  
				number++;  
			}  
			i++;  
		}
	}
}

class p4
{
	//Write and run a Java program to calculate factorial and the cube of the given integer number. Also find the sum and multiplication of its digits. Also 
	//check whether the no entered is palindrome or not
	static int getsum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner p4=new Scanner(System.in);
		System.out.println("\nEnter Integer Number :");
		int number=p4.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is : "+fact);
		
		int cube;
		cube=number*number*number;
		System.out.println("\nCube of Integer number "+number+" is : "+cube);
		
		
		System.out.println("\nSum of all digits is :"+getsum(number));
		
		int r,sum=0,temp;    //It is the number variable to be checked for palindrome 
		temp=number;    
		while(number>0)
		{    
			r=number%10;  //getting remainder  
			sum=(sum*10)+r;    
			number=number/10;    
		}    
		if(temp==sum)    
			System.out.println("\nfactorial number is palindrome number ");    
		else    
			System.out.println("\nfactorial number is not palindrome");  
		
		
	}
}

class p5
{
	//write a Java program to calculate the minimum of three integer numbers
	public static void main(String args[])
	{
		Scanner p5=new Scanner(System.in);
		System.out.println("Enter value of no1:"); 
		int no1=p5.nextInt();
		System.out.println("Enter value of no2:"); 
		int no2=p5.nextInt();
		System.out.println("Enter value of no3:"); 
		int no3=p5.nextInt();
		if(no1<no2 & no1<no3)
		{
			System.out.println("********** No-1 is Minimum **********");
		}
		else if(no2<no3)
		{
			System.out.println("********** No-2 is Minimum **********");
		}
		else
		{
			System.out.print("********** No-3 is Minimum **********");
		}
	}
}

class p6
{
	/*WAP in JAVA that calculates the VAT on an amount of sale. 
	The program takes amount of sales and VAT rate as input and outputs the total amount inclusive of VAT.*/
	public static void main(String args[])
	{
		Scanner p6=new Scanner(System.in);
		System.out.println("Enter value of sales :"); 
		double sales=p6.nextDouble();
		System.out.println("Enter value of VAT(%):");
		double vat=p6.nextDouble();
		
		double rate;
		rate=(sales *vat)/100;
		rate=rate+sales;		
		System.out.println("Amount with VAT "+rate);
	}
}

class p7
{
	//Use While loop to generate random numbers and maintain a running sum of these values. Terminate when the sum exceeds 20. 
	//(Note: use Math.random() method to obtain numbers.)
	public static void main(String args[])
	{
		int number = 0;
		int sum=0;
		while(sum<20)
		{
			number = 1+(int)(10*Math.random());
			System.out.println("random no :"+number);
			sum+=number;
			System.out.println("current sum :"+sum);
		}
		System.out.println("*********************************");
		System.out.println("sum :"+sum);
	}
}

class p8
{
	//Write an application that counts the total number of characters in all of its command-line argument
	public static void main(String args[])
	{
		System.out.println("Name is :"+args[0]);
		int count=0;
		String s=args[0];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total no of character is :"+count);	
	}
}

class p9
{
	//Write a java program to calculate Simple Interest using Command Line Arguments. (Hint use Wrapper classes)
	public static void main(String args[])
	{
		int price=Integer.parseInt(args[0]);
		int rate=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		int intrest;
		System.out.println("Price :"+price);
		System.out.println("Rate :"+rate);
		System.out.println("Year :"+year);
		intrest=(price*rate*year)/100;
		System.out.println("Simple Intrest value is :"+intrest);
	}
}