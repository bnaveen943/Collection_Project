package set1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test8 {
	public static void main(String[] args) {
		m1();
	}
	public static void m1()
	{ 
		HashSet<String> hs = new HashSet<String>();
		Collections.addAll(hs, "Geeks","For","Geeks","Web","Site");
		Iterator<String> iterator = hs.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string +" ");
		}
		System.out.println();
		for (String str : hs) {
			System.out.print(str + " ");
		}
	}

}
