import java.util.*;
 
// develop an application which handels push oprator and pop oprator on stack concurrantly
public class stack
{
	public static void main(String args[])
	{
		//declare and initialize a stack object
		Stack<String> stack = new Stack<String>();
		stack.push("PUNE");
		stack.push("MUMBAI");
		stack.push("NASHIK");
		
		System.out.println("Stack elements:");
		//get an iterator for the stack
		Iterator iterator = stack.iterator();
		//traverse the stack using iterator in a loop and print each element
		while(iterator.hasNext())
		{
			System.out.print(iterator.next() + " "); 
		}
		stack.pop(2);
	}
}