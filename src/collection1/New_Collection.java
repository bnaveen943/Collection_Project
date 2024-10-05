package collection1;

import java.io.*;
import java.util.*;

public class New_Collection {
	public static void main(String[] args) {
		New_Collection nw = new New_Collection();
		nw.m1();
	}

	public void m1() {
		List<String> arrl = new ArrayList<String>();
		Collections.addAll(arrl, "geeks","for","geeks","web","site");
		System.out.println("Elements which is presents in arraylist is "+arrl);
		System.out.println();
		Collections.sort(arrl);
		System.out.println("After sorting elements from the collection "+ arrl);
		Iterator<String> arral = arrl.iterator();
		System.out.println(arral.hashCode());
		System.out.println(arral.hasNext());
		for (int i = 0; i < arrl.size(); i++) {
			System.out.println(arral.next());
		}
		System.out.println(arral.hasNext());
		
		
	}
}
