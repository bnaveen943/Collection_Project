package sortedSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		add();
	}
	public static void add()
	{
		SortedSet<String> str = new TreeSet<>();
		Collections.addAll(str, "A","B","C","D","A");
		System.out.println(str);
		String check = "E";
		System.out.println("Check the 'E' is present in the SortedSet: "+str.contains("E"));
		System.out.println("Fist value is: "+str.first());
		System.out.println("Last Value is: "+str.last());
		
		str.remove("C");
		System.out.println("After removing 'C' from the Sorted Set "+str);
		str.add("K");
		str.add("X");
		str.add("J");
		
		//Iterator sortedSet 
		System.out.println("Iterate the sortedSet of the element ");
		for (Iterator iterator = str.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string+" ");
		}
	}

}
