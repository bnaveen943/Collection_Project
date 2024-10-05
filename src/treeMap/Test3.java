package treeMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Test3 {
	
	public static void main(String[] args) {
		SortedMap<Integer, String> sortedMap = new ConcurrentSkipListMap<>();
		
		sortedMap.put(10, "Geeks");
		sortedMap.put(121, "For");
		sortedMap.put(15, "Geeks");
		sortedMap.put(16, "Web");
		sortedMap.put(18, "Site");
		
		TreeMap<Integer, String> treeMap = new TreeMap<>(sortedMap);
		
		System.out.println("Treemap "+treeMap);
	}

}
