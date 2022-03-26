// Java program to add the
// elements in the stack
import java.io.*;
import java.util.*;
//import java.util.Scanner;

class StackDemo {

	// Main Method
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();

		//push()
		stack.push("This");
		stack.push("is");
		stack.push("Exam");
		stack.push("Time");
		stack.push("For MCA");

		System.out.println("Stack: " + stack);
		System.out.println("The element at the top of the stack is: " + stack.peek());
		System.out.println("Final Stack: " + stack);
		
		Stack<Integer> stack2 = new Stack<Integer>();

		// Use add() method to add elements
		stack2.push(10);
		stack2.push(15);
		stack2.push(30);
		stack2.push(20);
		stack2.push(5);

		// Displaying the Stack
		System.out.println("Initial Stack: " + stack2);

		// Removing elements using pop() method
		System.out.println("Popped element: "+ stack2.pop());
		System.out.println("Popped element: "+ stack2.pop());

		// Displaying the Stack after pop operation
		System.out.println("Stack after pop operation "+ stack2);
	}
}
