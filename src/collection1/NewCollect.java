package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewCollect {
	public static void main(String[] args) {
		List<Integer> values =new ArrayList<Integer>();
		Collections.addAll(values, 25,21,23,16,1,12);
		//Collection sorting
		Collections.sort(values);
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
		System.out.println();
		Collections.sort(values, Collections.reverseOrder());
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}
	}

}
