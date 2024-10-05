package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test4 {
	public static void main(String[] args) {
		// m1();
		//m2();
		m3();
	}

	public static void m1() {
		int n = 15;
		List<Integer> arr = new ArrayList<Integer>(n);

		for (int i = 10; i <= n; i++) {
			arr.add(i);
		}
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);

	}

	public static void m2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		List<Integer> vc = new Vector<>(n);
		for (int i = 0; i < n; i++) {
			vc.add(i);
		}
		System.out.println();
		System.out.println(vc);
		vc.remove(3);
		System.out.println(vc);
		for (int i = 0; i < vc.size(); i++) {
			System.out.print(vc.get(i) + " ");
		}
		
	}
	public static void m3()
	{
		ArrayList arrl = new ArrayList();
		
		Collections.addAll(arrl, 12,21,14,"Naveen","Hallikeri","Basavaraj");
		System.out.println(arrl);
		
	
 	}

}

















