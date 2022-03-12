package overriding;

class A {
strictfp void method(int a) 
{
	System.out.println("one");
}

strictfp void method(double b)
{
	System.out.println("Two");
	
}
}
 class B extends A
{
	void method(double b) 
	{
		System.out.println("Three");
	}
	
}
  class Test{
	public static void main(String[] args) {
		new B().method(20);
	}
}

