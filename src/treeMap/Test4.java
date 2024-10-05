package treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Test4 {

	static TreeMap<Integer, String> brics;

	static void create() {
		brics = new TreeMap<Integer, String>();

		System.out.println("Successfully created TreeMap ");

	}

	static void insert() {
		brics.put(1, "Brazil");
		brics.put(2, "Russia");
		brics.put(3, "India");
		brics.put(4, "China");
		brics.put(5, "Sounth Africa");

		System.out.println("Element are successfully inserted in the TreeMap" + brics);

	}

	static void search(int key) {
		System.out.println("Search the element using the key " + brics.containsKey(key));

	}

	static void search(String Value) {
		System.out.println("Search using value " + brics.containsValue(Value));

	}
	
	static void display() {
		System.out.println("Display the element "+brics);
	}
	static void traverse()
	{
		System.out.println("\n traversing the treemap Element ");
		
		for(Map.Entry<Integer, String> element: brics.entrySet())
		{
			System.out.println(" key "+element.getKey() + " Value "+element.getValue());
		}
	}

	public static void main(String[] args) {

		// Create a TreeMap
		create();

		// Insert Country
		insert();

		// Search the key

		search(50);

		// search the Value
		search("India");
		
		//display
		display();
		
		//traversing
		traverse();

	}

}
