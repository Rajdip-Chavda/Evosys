import java.io.*;
import java.util.*;  
public class stack1   
{  
	public static void main(String args[])   
	{	  
		//object of Stack class  
		Stack <Integer> stack = new Stack<>();  	
		System.out.println("stack: " + stack + "Emplty"); //empty currently 
		
		//push  
		push(stack, 1);  
		push(stack, 2);  
		push(stack, 3);  
		push(stack, 4);  
		push(stack, 5);  
		push(stack, 6);  
		push(stack, 7);  
		
		//pop 
		//pop(stack);  
		
		//throws exception if stack is empty  
		try   
		{  
			pop(stack);  
		}   
		catch (EmptyStackException e)   
		{  
			System.out.println("empty stack");  
		}  
	}  
	//push operation  
	static void push(Stack stack, int x)   
	{  
		//invoking push() method      
		stack.push(new Integer(x));  
		System.out.println("push :" + x);  
		//prints modified stack  
		System.out.println("stack: " + stack);  
	}  
	
	//pop operation  
	static void pop(Stack stack)   
	{  
		System.out.print("pop :");  
		//pop() method   
		Integer x = (Integer) stack.pop();  
		System.out.println(x);  
		//modified stack  
		System.out.println("stack: " + stack); 
	}  
}  

class stack2
{
	//secend method of stack
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		System.out.println();
		//push()
		stack.push("This");
		stack.push("is");
		stack.push("Exam");
		stack.push("Time");
		stack.push("For MCA");

		System.out.println("Stack: " + stack);
		System.out.println("Peek from Stack: " + stack.peek());
		stack.pop();
		System.out.println("Modify Sack: " + stack);
		System.out.println();
		
		Stack<Integer> stack2 = new Stack<Integer>();

		stack2.push(10); //push method
		stack2.push(15);
		stack2.push(30);
		stack2.push(20);
		stack2.push(5);
		stack2.add(200); //add method

		// Displaying the Stack
		System.out.println("Stack: " + stack2);

		// Removing elements using pop() method
		System.out.println("Popped element: "+ stack2.pop());
		System.out.println("Popped element: "+ stack2.pop());

		// Displaying the Stack after pop operation
		System.out.println("Stack after pop"+ stack2);
	}
}
