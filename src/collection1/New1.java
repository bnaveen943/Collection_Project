package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class New1 {
	public static void main(String[] args) {
		// m1();
		//m2();
		//m3();
		m4();
	}

	public static void m1() {
		// Adding the elements to the collection objects
		List<String> items = new ArrayList<String>();

		// add elements items
		items.add("Shoes");
		items.add("Toys");

		// add one or more elements
		Collections.addAll(items, "Fruits", "Bat", "Ball");

		// printing the list elements
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");

		}

	}

	public static void m2() {
		// creating object of the string and integer
		List<String> items = new ArrayList<String>();
		// adding the elements in the items
		items.add("Shoes");
		items.add("Toys");
		// Adding one or more elements using collection
		Collections.addAll(items, "Fruits", "Bat", "Ball", "Bike");

		// Collection sort
		Collections.sort(items);
		// Printing elements using for loop
		System.out.println("Elements are in the order");
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}
		System.out.println();
		// Print the items in the reverse order

		Collections.sort(items, Collections.reverseOrder());

		// Print the elements in the reverse order
		System.out.println("Elements are in the reverse order");

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

	}
	public static void m3()
	{
		// Binary search using collection
		
		List<String> items = new ArrayList<String>();
		// Add the elements using collection
		Collections.addAll(items, "Shoes","Toys","Horse","Ball","Grapes");
		// Sort elements before going to binary search
		Collections.sort(items);
		
		/*for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i)+ " ");
		}
		*/ 
		System.out.println("The index of Horse is "+Collections.binarySearch(items, "Horse"));
		
		System.out.println("The index of Dog is "+Collections.binarySearch(items, "Dog"));
		
		
	}
	public static void m4()
	{
		List<String> destination_list = new ArrayList<String>();
		
		// adding one or more elements using collection
		
		Collections.addAll(destination_list, "Shoes","Toys","Horse","Tiger");
		
		System.out.println("The original destination list is ");
		
		for (int i = 0; i < destination_list.size(); i++) {
			System.out.println(destination_list.get(i)+ " ");
		}
		System.out.println();
		
		// Creating source elements
		List<String> source_list = new ArrayList<String>();
		// Adding elements using 
		
		Collections.addAll(source_list, "Bat","Lion","Cat","Dog");
		//Coping items from the source to destination
		
		/*
		Collections.copy(destination_list,source_list);
		System.out.println("The detination list after coping is ");
		for (int i = 0; i < destination_list.size(); i++) {
			System.out.println(destination_list.get(i)+ " ");
		}
		*/
		System.out.println(Collections.disjoint(destination_list, source_list));
		
		
	}

}
