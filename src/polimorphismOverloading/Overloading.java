package polimorphismOverloading;

public class Overloading {
public static void main (String[]args) {
	OverloadingScenarios obj =new OverloadingScenarios();
	//scene 1:
		A a=new A();
		obj.m1(a);
		//scene 2:
		B b=new B();
		obj.m1(b);
		//scene 3:
		c c=new c();
		obj.m1(c);
		
	
}
}
