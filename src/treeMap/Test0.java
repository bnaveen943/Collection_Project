package treeMap;

import java.util.TreeMap;

public class Test0 {
	static void ExecuteConstructor()
	{
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(11, "Geeks");
		treeMap.put(2, "For");
		treeMap.put(31, "Geeks");
		treeMap.put(14, "Good");
		treeMap.put(7, "Web Site");
		treeMap.put(61, "For new learner");
		System.out.println("Tree: "+treeMap);
		
	}	
	public static void main(String[] args) {
		System.out.println("TreeMap using TreeMap Constructor");
		
		ExecuteConstructor();
	}

}
