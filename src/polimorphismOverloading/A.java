package polimorphismOverloading;

public class A {

}
class B extends A{
	
}
class c extends B{
	
}
class OverloadingScenarios{
	void m1(A a) {
	System.out.println("I am in m1-A");
}
	void m1(B b) {
		System.out.println("I am in m1-B");
	}
	void m1(c c) {
		
		System.out.println("I am in m1-C");
	}
}
			
		
	
	
	
