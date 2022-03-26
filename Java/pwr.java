import java.util.*;
class pwr
{
	double b;
	int e;
	double val;
	
	pwr(double base,int exp)
	{
		this.b=base;
		this.e=exp;
		
		this.val=1;
		if(exp==0)
			return;
			
		for(;exp>0;exp--)
		{
			this.val=this.val*base;
		}
		double get_pwr()
		{
			return this.val;
		}
	}
}
class demopwr
{
	public static void main(String args[])
	{
		pwr x=new pwr(4.0,2);
		pwr y=new pwr(2.5,1);
		pwr z=new pwr(5.7,0);
		
		System.out.println(x.b+" raised to the "+x.e+" power is "+x.get_pwr()); 
		System.out.println(y.b+" raised to the "+y.e+" power is "+y.get_pwr()); 
		System.out.println(z.b+" raised to the "+z.e+" power is "+z.get_pwr()); 
	}
}