package sortedSet;

import java.nio.Buffer;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		//navigate();
		tree_Set();
	}
	public static void navigate() {
		NavigableSet<Integer> navig_Set=new TreeSet<>();
		Collections.addAll(navig_Set, 0,1,2,3,4,5,6);
		
		
		// Reverse order
		NavigableSet<Integer> reverse_Navi =navig_Set.descendingSet();
		
		// Normal order
		System.out.println(navig_Set);
		//Reverse order
		System.out.println(reverse_Navi);
		
		NavigableSet<Integer> threeOrMore =navig_Set.tailSet(3, true);
		System.out.println(threeOrMore);
		
		System.out.println("Lower "+navig_Set.lower(3));
		System.out.println("Higer "+navig_Set.higher(3));
		System.out.println("Floor "+navig_Set.floor(3));
		System.out.println("ceiling "+navig_Set.ceiling(3));
		
		System.out.println("PollFisrt "+navig_Set.pollFirst());
		System.out.println(navig_Set);
		
		System.out.println("PollLast "+navig_Set.pollLast());
		System.out.println(navig_Set);
		
		System.out.println("PollFist "+navig_Set.pollFirst());
		System.out.println(navig_Set);
		
		System.out.println("PollLast "+navig_Set.pollLast());
		System.out.println(navig_Set);
	}
	
	public static void tree_Set() {
		
	Set<StringBuffer> stringBuffe=new TreeSet<StringBuffer>();
	try {
		stringBuffe.add(new StringBuffer("A"));
		stringBuffe.add(new StringBuffer("D"));
		stringBuffe.add(new StringBuffer("Z"));
		stringBuffe.add(new StringBuffer("K"));
		stringBuffe.add(new StringBuffer("P"));
		stringBuffe.add(new StringBuffer("1"));
		System.out.println(stringBuffe);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
		
	}

}
