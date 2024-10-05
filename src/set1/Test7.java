package set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test7 {
	public static void main(String[] args) {
		// m1();
		m2();
	}

	public static void m1() {
		HashSet<ArrayList> hash_Set = new HashSet<>();

		ArrayList<Integer> list1 = new ArrayList<>();

		// crating second arraylist
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(12);
		list1.add(23);
		list2.add(25);
		list2.add(29);

		hash_Set.add(list1);
		hash_Set.add(list2);
		System.out.println(hash_Set);

		System.out.println(hash_Set.size());
		System.out.println(list1.equals(list2));
		System.out.println(list1.hashCode());
		System.out.println(list2.hashCode());
		System.out.println(list1.hashCode());
		// clear the element
		hash_Set.clear();
		System.out.println(hash_Set);

	}

	private static void m2() {
		HashSet<String> brics = new HashSet<String>();
		Collections.addAll(brics, "Brazil","Russia","India","China","South Africa");
		
		System.out.println(brics);
		
		brics.remove("China");
		System.out.println(brics);
		
		for (Iterator iterator = brics.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
