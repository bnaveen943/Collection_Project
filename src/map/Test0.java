package map;

import java.util.HashMap;
import java.util.Map;

public class Test0 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		map.put("A", new Integer(100));
		map.put("C", new Integer(300));
		map.put("E", new Integer(500));
		map.put("G", new Integer(700));
		
		for (Map.Entry<String, Integer> maps:map.entrySet()) {
			System.out.print(maps.getKey() + " ");
			System.out.println(maps.getValue());
		}
		
	}

}
