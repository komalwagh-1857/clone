 package objArray;

import java.util.Arrays;

public class HetrogeneousArray {
public static void main(String[] args) {
	String s1="AAA";
	Student s1d= new Student(11,"shaam","pune");
	String s2="BBc";
	Student s2d= new Student(22,"Ram","kolhapur");
	String s3="DDD";
	Student s3d= new Student(12,"Ganesh","Sangli");
	
	Object[] elements={s1,s1d,s2,s2d,s3,s3d};{
	System.out.println(Arrays.toString(elements));}
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

for(Object O:elements){
	if(O instanceof String)
	System.out.println(O);
}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	for(Object O:elements){
		if(O instanceof Student)
		System.out.println(O);	
		
	}
}
}