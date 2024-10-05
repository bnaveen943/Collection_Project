package treeMap;

import java.util.Comparator;

public class sortByRoll implements Comparator<Student>{
	

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollNo - b.rollNo;
	}

}
