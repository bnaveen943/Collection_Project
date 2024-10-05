package set1;

import java.awt.Label;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linked_Hash_Set {
	public static void main(String[] args) {
		//m1();
		m2();
	}
	public static void m1() {
		LinkedHashSet<String> lhs =new LinkedHashSet<>();
		
		Collections.addAll(lhs, "A","B","C","D");
		lhs.add("A");
		lhs.add("E");
		
		System.out.println("Size of the LinkedHashSet "+lhs.size());
		System.out.println("Original LinkedHashSet "+lhs);
		
		// Remove one element from the LinkedHashSet
		
		System.out.println("Remove C from the LinkedHashSet "+lhs.remove("C"));
		
		// Try to remove element which is not their in the lhs
		System.out.println("Remove K element "+lhs.remove("K"));
		
		// Check the element which is contain
		System.out.println("Checking B if it is there in LinkedHashSet "+lhs.contains("B"));
		
		// Final LinekedHashSet 
		System.out.println("Final LinkedHashSet "+lhs);
	}
	
	public static void m2() {
		Set<String> linked_HashSet=new LinkedHashSet<>();
		Collections.addAll(linked_HashSet, "Geeks","For","Geeks","Web","Site","It's","Very help full");
		linked_HashSet.spliterator();
		System.out.println(linked_HashSet);
		
		// parellelStream
		linked_HashSet.parallelStream();
		System.out.println(linked_HashSet);
		
		// Stream
		linked_HashSet.stream();
		System.out.println(linked_HashSet);
		Iterator iterator =linked_HashSet.iterator();
		while (iterator.hasNext()) {
			System.out.print (iterator.next() + " ");
			
		}
	}

}
