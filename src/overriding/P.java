package overriding;

public class P {
	
	void m1(Number n)
	{ 
	 System.out.println("m1-P"); 
	 } 
	} 
	class Q extends P 
	{ 
	void m1(double d)
	{ 
	 System.out.println("m2-Q"); 
	} 
	public static void main(String[] args) 
	{ 
	 Q q = new Q(); 
	  q.m1(1); 
	 q.m1(null); 
	 } 
	}


