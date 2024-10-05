package treeMap;

import java.util.TreeMap;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("The final TreeMap from Second constuctor");
		excecutrConstructor2();

	}

	static void excecutrConstructor2() {
		TreeMap<Student, Integer> treeMap = new TreeMap<>(new sortByRoll());

		treeMap.put(new Student(121, "Naveen", "Gondba;"), 2);
		treeMap.put(new Student(131, "Ramya", "Canada"), 1);
		treeMap.put(new Student(111, "Lavanya", "Norway"), 3);

		System.out.println("TreeMap " + treeMap);

	}

}
