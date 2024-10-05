package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) {
		//dot();
		//tree();
		add();
	}
	public static void add() {
		Map<Integer, String> maps=new HashMap<Integer, String>();
		
		maps.put(1, "Geeks");
		maps.put(2, "For");
		maps.put(3, "Geeks");
		
		Map<Integer, String> map=new HashMap<>();
		map.put(new Integer(1), "geeks");
		map.put(new Integer(2), "geeks");
		map.put(new Integer(3), "geeks");
		
		System.out.println(maps);
		System.out.println(map);
		map.remove(new Integer(2));
		
		//remove element from the Hashmap
		System.out.println(map);
		
		map.put(new Integer(2), "for");
		
		// Updated value
		System.out.println(map);
		
		//Iterating the element 
	for (Map.Entry<Integer, String> elements : maps.entrySet()) {
		int keys=(int)elements.getKey();
		
		String key_String = (String)elements.getValue();
		
		System.out.println(keys + " : "+key_String);
	}
		
		
	}
	public  static void tree() {
		Map<String, Integer> intr = new TreeMap<>();
		
		intr.put("Naveen", 25);
		intr.put("Karthi", 15);
		intr.put("Sachin", 10);
		intr.put("Vaibav", 65);
		intr.put("Vishal", 55);
		
		for (Map.Entry<String, Integer> element : intr.entrySet()) {
			System.out.println(element.getKey()+ " "+element.getValue());
		}
		
	}
	public static void dot()
	{
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("Naveen", 10);
		map.put("Hallikeri", 300);
		map.put("Lord Shiva", 25);
	
		
		for (Map.Entry<String, Integer> itr : map.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}

}
