package encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
	
	e1.setName("Raj");
	e1.setId(2345);
	
	e2.setName("Ganesh");
	e2.setId(4567);

	System.out.println(e1.getName());
System.out.println(e1.getId());

System.out.println(e2.getName());
System.out.println(e2.getId());


	
	

} 
}
