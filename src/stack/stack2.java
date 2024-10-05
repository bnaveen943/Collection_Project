package stack;

import java.util.Collections;
import java.util.Stack;

public class stack2 {
	public static void main(String[] args) {
		//m1();
		m2();
	}

	public static void m1() {
		Stack stack12 = new Stack(); // default stack

		Collections.addAll(stack12, 4, "All", "geeks", "for", "geeks");
		Stack<String> stack22 = new Stack<String>();
		Collections.addAll(stack22, "for", "geeks", "and", "geeks");
		System.out.println(stack22);
	}
	public static void m2()
	{
		Stack<String> stack =new Stack<String>();
		stack.push("Welcome");
		stack.push("to");
		stack.push("geeks");
		stack.push("for");
		stack.push("geeks");
		stack.push("web");
		System.out.println("Initial stack: "+stack);
		// Fetching the elements at the head of the stock
		System.out.println("The element at the top of the "+" stack is: "+stack.peek());
		//pop element from the stack
		System.out.println("Pop the element from the stack "+stack.pop());
		// Display the stack after the operation
		System.out.println("Final stack "+stack);
		
	}

}
