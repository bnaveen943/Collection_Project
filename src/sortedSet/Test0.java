package sortedSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test0 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		SortedSet<String> group=new TreeSet<>();
		Collections.addAll(group, "America","Germany","Italy","France","Russia","Canada","Japan","United_Kingdom");
		System.out.println(group);
		group.remove("Russia");
		System.out.println("Russia is removed from G8 and know it is G7 ");
		System.out.println(group);
		System.out.println("Iterate the group");
		for (Iterator iterator = group.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string +" ");
		}
	}

}
