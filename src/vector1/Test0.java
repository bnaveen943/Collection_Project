package vector1;

import java.util.Collections;
import java.util.Vector;

public class Test0 {
	public static void main(String[] args) {
		//add();
		
		//update();
		iterat();
	}
	public static void add()
	{
		//creating default vector
		Vector add1 =new Vector();
		Collections.addAll(add1, "1","2","geeks","for","geeks",3);
		System.out.println("default vector "+ add1);
		Vector<Integer> v1=new Vector<Integer>();
		Collections.addAll(v1, 2,4,6);
		System.out.println("After default vector " +v1);
	}
	public static void update()
	{
		Vector<Integer> vc = new Vector<Integer>();
		Collections.addAll(vc, 12,13,14,15,16,34);
		System.out.println("Vector : "+vc);
		System.out.println("Vector update using set: "+vc.set(0, 21));
		System.out.println(vc);
		
		// 
		System.out.println("Vector again update using set: "+vc.set(3, 51));
		
		
		System.out.println(vc);
		
		System.out.println("Remove elements from the exitsting vector: "+vc.remove(2));
		System.out.println("Revome elements using by their name: "+vc.remove(3));
	}
	public static void iterat()
	{
		Vector<String> vc=new Vector<>();
		Collections.addAll(vc, "geeks","for","geeks");
		// for each loop 
		for (String string : vc) {
			System.out.println(string);
		}
	}

}
