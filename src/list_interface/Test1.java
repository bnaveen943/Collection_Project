package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Integer> arrl = new ArrayList<Integer>();
		arrl.add(0, 1);
		arrl.add(1, 2);
		System.out.println(arrl);
		
		List<Integer> arrl1 = new ArrayList<Integer>();
		Collections.addAll(arrl1, 1,2,3);
		arrl.addAll(1, arrl1);
		
		System.out.println(arrl);
		//remove 
		arrl.remove(1);
		System.out.println(arrl);
		try {
			System.out.println(arrl.get(3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		arrl.set(0, 12);
		System.out.println(arrl);
		
	}

}
