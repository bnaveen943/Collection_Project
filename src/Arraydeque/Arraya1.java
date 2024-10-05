
package Arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Arraya1 {
	public static void main(String[] args) {
		m1();
	}

	public static void m1() {
		Deque<Integer> dq_Array = new ArrayDeque<Integer>();
		dq_Array.add(10);
		dq_Array.add(23);
		dq_Array.add(25);
		dq_Array.add(45);
		dq_Array.add(78);
		dq_Array.add(49);
		for (Integer integer : dq_Array) {
			System.out.print(integer + " ");
		}
		System.out.println();
		// Clear the element from the deque
		dq_Array.clear();
		System.out.println(dq_Array + " Elements are clear from the ArrayDeque");

		dq_Array.addFirst(250);
		dq_Array.addLast(500);
		dq_Array.addFirst(400);
		dq_Array.addLast(600);
		System.out.print(dq_Array + " ");
		System.out.println();
		System.out.println("Iterate the elements from a arrayDeque");
		for (Iterator iterator = dq_Array.iterator(); iterator.hasNext();) {
			Integer element = (Integer) iterator.next();
			System.out.print(element + " ");

		}
		System.out.println();
		System.out.println("Element are in decending oreder using iterator");
		for (Iterator iterator1 = dq_Array.descendingIterator(); iterator1.hasNext();) {
			Integer value = (Integer) iterator1.next();
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println("Get the first element" + dq_Array.getFirst());
		System.out.println("Get the last element " + dq_Array.getLast());

		// toArray method
		Object[] arr = dq_Array.toArray();
		System.out.println("Length of the array element " + arr.length);
		System.out.println("Print the array element from the object");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// peek method
		System.out.println("Head element using peek " + dq_Array.peek());

		// poll method
		System.out.println("Head element using the poll method " + dq_Array.poll());

		// push the element
		dq_Array.push(25);
		dq_Array.push(54);
		dq_Array.push(78);
		System.out.println("remove the element from the dq_array " + dq_Array.remove());

		// final dq_array
		System.out.println("Final de_Array " + dq_Array);

	}

}
