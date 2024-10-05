package set1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test5 {
	public static void main(String[] args) {
		Test5 a1 = new Test5();
		a1.brick();
	}

	public void brick() {
		Set<String> brics = new LinkedHashSet<String>();
		Collections.addAll(brics, "India", "Brazil", "Russia", "China", "South Africa");

		System.out.println("Brics country " + brics);

		brics.remove("China");

		System.out.println("Iterating over set: ");
		Iterator<String> iterator = brics.iterator();

		// Iterating the element
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
