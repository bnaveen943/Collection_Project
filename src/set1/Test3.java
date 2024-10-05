package set1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		//basic();
		country();
	}
	public static void basic()
	{
		Set<String> brics = new HashSet<String>();
		Collections.addAll(brics, "Brazil","Russia","India","China","South Africa");
		System.out.println(brics);
		
		String oneMore = "Iran";
		// Check the Iran is there in brics using contains
		
		System.out.println("Contains "+oneMore+ " "+brics.contains(oneMore));
		
		//remove the china from the brics
		brics.remove("China");
		System.out.println("After remove the china from the brics "+brics);
		
		// Iterate the Brics
		System.out.println("Iterator use ");
		for (String string : brics) {
			System.out.print(string +" ");
		}
	}
	public static void country()
	{
		Set<String> quad = new HashSet<String>();
		
		// Country which are in the Quad
		
		Collections.addAll(quad, "India","America","Japan","Australia");
		quad.add("India");
		
		System.out.println("Country are present in the Quad "+quad);
		
		quad.remove("Australia");
		
		System.out.println("Set after removing "+"Australia "+quad);
		
		System.out.println("Iteraing over set: ");
		
		Iterator<String> iterator = quad.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string +" ");
		}
		
	}

}
