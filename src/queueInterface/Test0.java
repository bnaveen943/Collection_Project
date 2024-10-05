package queueInterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test0 {
	public static void main(String[] args) {
		//que_Int();
		//que_Priority();
		//que_Iterator();
		
	}

	public static void que_Int() {
		Queue<Integer> queue = new LinkedList<Integer>();
		// add element on queue
		for (int i = 1; i <= 5; i++) {
			queue.add(i);
		}
		System.out.println("Elements in queue " + queue);

		int removedele = queue.remove();
		System.out.println("After romving element from the queue " + removedele);
		System.out.println(queue);
		// To view the head of the queue

		Integer head = (Integer) queue.peek();
		System.out.println("Head of the queue " + head);
		
		

		int size = queue.size();
		System.out.println("Size of the queue element "+size);

	}
	public static void que_Priority()
	{
		Queue<String> queue = new PriorityQueue<String>();
		Collections.addAll(queue, "geeks","for","geeks");
		System.out.println(queue);
		queue.remove("Geeks");
		System.out.println("After removing element from the queue "+queue);
		
		System.out.println("Poll method "+queue.poll());
		System.out.println("Final queue "+queue);
		
	}
	public static void que_Iterator()
	{
		Queue<String> qi = new PriorityQueue<String>();
		Collections.addAll(qi, "Naveen","Hallikeri","Lavanaya","Soumya");
		
		Iterator iterator1=qi.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next() + " ");
			
		}
	}

}
