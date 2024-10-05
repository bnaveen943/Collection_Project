package treeMap;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
	static void executeConstructor3() {
		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(10, "Geeks");
		hashMap.put(121, "For");
		hashMap.put(15, "Geeks");
		hashMap.put(16, "Web");
		hashMap.put(18, "Site");

		TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);

		System.out.println("Print element from the treeMap " + treeMap);

	}

	public static void main(String[] args) {
		System.out.println("TreeMap using the Map and HashMap ");
		
		executeConstructor3();

	}

}
