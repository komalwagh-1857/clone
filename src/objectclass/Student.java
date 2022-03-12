package objectclass;

import aggregation.Address;

public class Student {
	int roll;
	String name;
	Address adress;
	public Student() {
		
	}
	public Student(int roll,String name,Address address) {
		this.roll=roll;
		this.name=name;
		this.adress=address;
		
	} 
	
	
public Student(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", adress=" + adress + "]";
	}


}
