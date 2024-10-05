package collect;

import java.util.Collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> mylist = new LinkedList<>();
		Collections.addAll(mylist, "abc","mno","pqr","xyz");
		for (String string : mylist) {
			System.out.println(string);
		}
	}

}
