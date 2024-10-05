package set1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test6 {
	public static void main(String[] args) {
		Test6 a1 = new Test6();
		a1.group();
	}

	public void group() {
		Set<String> group = new TreeSet<String>();
		Collections.addAll(group, "America", "Russia", "Canada", "France", "Germany", "Italy", "Japan",
				"United_Kingdom");
		// Group eight
		System.out.println(group);

		// Remove the element from the TreeSet

		group.remove("Russia");

		System.out.println("Russia is remove from G8 in 2014 know it become G7 " + group);

		// Iterating element using TreeSet
		System.out.println("Iterator using TreeSet");
		for (Iterator iterator = group.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string + " ");
		}

	}

}
