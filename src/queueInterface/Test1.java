package queueInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {
	public static void main(String[] args) {
		//priority();
		linked();
	}

	public static void priority() {
		Queue<Integer> qp = new PriorityQueue<Integer>();
		qp.add(12);
		qp.add(2);
		qp.add(21);
		qp.add(15);
		System.out.println(qp);
		System.out.println(qp.peek());
		System.out.println(qp);
		System.out.println(qp.poll());
		System.out.println(qp);
		System.out.println(qp.peek());
		System.out.println(qp);
	}
	public static void linked()
	{
		Queue<Integer> ql = new LinkedList<Integer>();
		ql.add(12);
		ql.add(2);
		ql.add(21);
		ql.add(15);
		
		for (Integer integer : ql) {
			System.out.print(integer + " ");
		}
		System.out.println(ql.peek());
		System.out.println(ql.poll());
		System.out.println(ql.peek());
		
		
	}

}
