package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<String> iterat = new ArrayList<String>();
		
		Collections.addAll(iterat, "Geeks","Geeks","For");
		System.out.println(iterat.isEmpty());
		System.out.println(iterat.contains("geeks"));
		for (int i = 0; i < iterat.size(); i++) {
			System.out.print(iterat.get(i)+ " "); // using for loop iteration
		}
		System.out.println();
		for (String string : iterat) {
			System.out.print(string + " ");
		}
	}

}

