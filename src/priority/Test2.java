package priority;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Test2 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		Deque<Integer> dq = new ArrayDeque<Integer>();
		Collections.addAll(dq, 21,23,32,33,24,65);
		System.out.println(dq);
		dq.clear();
		System.out.println(dq);
		dq.addFirst(200);
		dq.addLast(250);
		dq.addFirst(12);
		dq.addLast(23);
		
		System.out.println(dq);
	}

}
