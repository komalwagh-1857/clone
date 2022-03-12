package overriding;

public class A2 {
	
      protected void m1()
	 { 
	 System.out.println("m1-A"); 
	 } 
	}
	 class S extends A2
	{ 
	public final void m1()
	{ 
	 System.out.println("m1-S"); 
	} 
	public static void main(String[] args) 
	{ 
	 S b = new S(); 
	  b.m1(); 
	 A2 a = new S(); 
	  a.m1(); 
	 } 
	}


