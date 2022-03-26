import java.util.Arrays;
import java.util.*;
class Test
{
	public static void main(String args[])
	{
		
		double[] m = new double[4];
		m[0]=1.2;
		m[1]=2.5;
		m[2]=3.4;
		m[3]=1.1;
		
		System.out.println(m[0] + "\n" + m[1] + "\n"+ m[2] + "\n" + m[3]);
		
		double total;
		total = m[0] + m[1] + m[2] + m[3];
		System.out.println("total is  : " + total);
		
		
		
		Arrays.sort(m);
		System.out.println("minimum is : " + m[0]);
		System.out.println("maximum is : " + m[m.length-1]); 
	}
}