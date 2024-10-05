package priority;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}
	public static void m1()
	{
		Deque<String> dq = new LinkedList<String>();
		dq.add("E");
		dq.addFirst("V");
		dq.addLast("E");
		dq.addFirst("A");
		dq.addFirst("N");
		dq.addLast("N");
		System.out.println(dq);
		dq.push("Hallikeri");
		System.out.println(dq);
		dq.offer("Basavaraj");
		System.out.println(dq);
		dq.offerFirst("Sharanamma");
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
	}
	public static void m2()
	{
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("For");
		deque.addFirst("Geeks");
		deque.addLast("Geeks");
		
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque.poll());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
	}
	public static void m3() {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("For");
		deque.addFirst("Geeks");
		deque.addLast("Geeks");
		deque.add("good");
		deque.add("website");
		for (Iterator iterator = deque.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + " ");
			
		}
		System.out.println();
		for (Iterator iterator1 = deque.descendingIterator(); iterator1.hasNext();) {
			String string1 = (String) iterator1.next();
			System.out.print(string1 +" ");
			
		}
	}

}
