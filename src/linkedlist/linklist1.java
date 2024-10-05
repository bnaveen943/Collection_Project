package linkedlist;

import java.util.LinkedList;

public class linklist1 {
	public static void main(String[] args) {
		//m1();
		m2();
	}
	public static void m1()
	{
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.addFirst("C");
		ll.addLast("D");
		ll.add(2, "E");
		System.out.println("Elements in linkedlist : "+ll);
		ll.remove("A");
		ll.remove(2);
		ll.removeFirstOccurrence("C");
		System.out.println(ll);
		ll.removeLastOccurrence("cat");
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("After removing elements "+ll);
	}
	public static void m2()
	{
		
	}
}
