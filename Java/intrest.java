import java.util.*;
import java.util.lang.*;
class intrest
{
	public static void main(String args[])
	{
		int p,r,n;
		double i1,c1;
		p=100;
		r=5;
		n=1;
		
		c1=1+(double)r/100;
		int a=Math.pow(c1,n);
		i1=p*a;
		System.out.println("compound Intrest :"+i1);
	}
}