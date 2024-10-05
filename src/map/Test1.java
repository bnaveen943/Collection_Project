package map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		m1();
	}

	public static void m1()
	{
		Map<String, Integer> hash = new HashMap<String, Integer>();
		
		hash.put("Naveen", 25);
		hash.put("Hallikeri", 30);
		hash.put("Basavaraj", 35);
		
		for (Map.Entry<String, Integer> iterable_element : hash.entrySet()) {
			System.out.println(iterable_element.getKey() +" "+iterable_element.getValue());
		}
	}

}
