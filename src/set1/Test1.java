package set1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Union_Inter_Differ();
	}

	public static void Union_Inter_Differ() {
		Set<Integer> a=new HashSet<Integer>();
		// add the all the elements to the list
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		
		// again declare on set 
		Set<Integer> b = new HashSet<Integer>();
		// with reference to HashSet
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of two set in java");
		System.out.println(union);
		
		//To find the intersection 
		Set<Integer> inter = new HashSet<Integer>(a);
		inter.retainAll(b);
		System.out.println("Intersection of two set in java ");
		System.out.println(inter);
		
		// To find the symmetric difference
		Set<Integer> differ = new HashSet<Integer>(a);
		differ.removeAll(b);
		System.out.println("Difference of two sets in java");
		System.out.println(differ);
		

	}

}
