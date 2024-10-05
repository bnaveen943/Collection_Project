package collect;

import java.util.HashMap;

public class Test0 {
	public static void main(String[] args) {
		m1();
		
	}
	public static void m1() {
		HashMap<Integer, String> hmap = new HashMap<>(10, 0.5f);
		
		HashMap<Integer, String> hmaps = new HashMap<>(10, 0.6f);
		
		hmap.put(1, "one");
		hmap.put(2, "Two");
		hmap.put(3, "Three");
		
		hmaps.put(4, "four");
		hmaps.put(5, "Five");
		hmaps.put(6, "Six");
		
		System.out.println("Maping of the first hmap is : "+hmap);
		
		System.out.println("Mapping of the second hmaps is : "+hmaps);
		
	}

}
