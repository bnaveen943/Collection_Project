package list_interface;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
	//	List<String> a2=new List<String>();
		List<String> a1=new ArrayList<String>();
		a1.add("Naveeen");
		a1.add("Hallikeri");
		a1.add(1, "Basavaraj");
		System.out.println("Initial list"+ a1);
		a1.set(1, "Basavarajappa");
		System.out.println("After a set "+a1);
		a1.remove(1);
		System.out.println("Remove 1st index "+a1);
		a1.remove("Hallikeri");
		System.out.println(a1);
	}

}
