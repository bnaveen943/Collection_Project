package treeMap;

public class Student {
	int rollNo;
	String name,address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public String toString()
	{
		return this.rollNo +" "+this.name + " "+this.address;
	}

}
