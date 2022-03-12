package polimorphismOverloading;

public class SimpleOverloading {
	public void method1(int i) {
		System.out.println("inside method1-int");
	}
	public void method1(long i) {
		System.out.println("inside method1-Long");
	}
	public static void main(String[]args) {
		SimpleOverloading obj=new SimpleOverloading();
		obj.method1(10);
	}
}  
