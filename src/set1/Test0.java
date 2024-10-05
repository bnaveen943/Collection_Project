package set1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test0 {
	public static void main(String[] args) {
	m1();	
	}
	public static void m1()
	{
		Set<String> hash = new HashSet<String>();
		Collections.addAll(hash, "Geeks","For","Geeks","Example","Set");
		System.out.println(hash);
	}

}
