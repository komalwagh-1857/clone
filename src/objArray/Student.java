package objArray;

public class Student {
	int rollNo;
	String name;
	String address;
	private int rollno;
	public Student() {}
		
	
	public Student(int rollNo,String name,String address) 
	{
		this.name=name;
		this.rollNo=rollNo;
		this.address=address;
		
		
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", rollno=" + rollno + "]";
	}
	
}
	