import java.util.*;

class stack
{
	int top = -1;
	int stack[]=new int[10];
}

class push extends stack implements Runnable
{
	public void run()
	{
		try
		{
		
				if( top == 10)  
				System.out.println("The Stack is full");  
				else 
				for( i=1; i<=5; i++)
				{
 
					stack[++top] = i;
				}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class pop extends Stack implements Runnable
{
	public void run()
	{
		try{
			
			if( top < 0)  
			System.out.println("The Stack is Empty");            
			else 
			{
				for(int i=1;i<=5;i++)
				{
					i = stack[top--];
					System.out.println(i);
				}
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class stackpushpop
{
	public static void main(String[] args)
	{
		
		try
		{
			push first = new push();
			pop second = new pop();
			
			Thread pu = new Thread(first);
			Thread po = new Thread(second);
			
			pu.start();
			pu.sleep(10);
			
			po.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
}