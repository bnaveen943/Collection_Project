package sortedMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		SortedMap<Integer, String> maps = new TreeMap<>();

		maps.put(new Integer(2), "Practice");
		maps.put(new Integer(5), "Geeks");
		maps.put(new Integer(1), "Quiz");
		maps.put(new Integer(3), "Geeks");
		maps.put(new Integer(4), "For");

		Set mapSet = maps.entrySet();

		// Using Iterator in sortedMap

		Iterator iterator = mapSet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> mps = (Map.Entry<Integer, String>) iterator.next();

			int key = (Integer) mps.getKey();

			String value = (String) mps.getValue();

			System.out.println("Key: " + key + " value: " + value);

		}

	}

}
