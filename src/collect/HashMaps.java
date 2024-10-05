package collect;

import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Vishal", 1);
		map.put("Vaibav", 2);
		map.put("Sachin", 3);
		map.put("Arun", 4);
		
		System.out.println("Size of the map is: "+map.size());
		
		System.out.println(map);
		
		if (map.containsKey("Vishal")) {
			Integer a = map.get("Vishal");
			System.out.println("Value for key is "+a);
		}
		
	}

}
