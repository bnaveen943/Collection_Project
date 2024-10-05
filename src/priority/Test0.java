package priority;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Test0 {
	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
	}

	public static void m1() {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < 3; i++) {
			pq.add(i);

		}
		pq.add(1);
		pq.add(2);
		System.out.println(pq);

	}
	public static void m2()
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		Collections.addAll(pq, "Naveen","Geeks","Geeks","For","Web","Site");
		System.out.println(pq);
		pq.remove("Web");
		pq.remove("Site");
		System.out.println("After removing element "+pq);
		System.out.println("poll the element "+pq.poll());
		System.out.println("Final priority queue "+pq);
		System.out.println("Accessing the element using peek "+pq.peek());
	}
	public static void m3()
	{
		PriorityQueue<String> pq=new PriorityQueue<String>();
		Collections.addAll(pq, "Geeks","Lord Shiva","For","Geeks","Naveen");
		Iterator<String> iterator = pq.iterator();
		/*
		for (String string : pq) {
			System.out.print(string + " ");
		}
		*/
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string + " ");
			
		}
	}

}
