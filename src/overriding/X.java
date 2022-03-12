package overriding;

public class X {

	void draw(int a, float b)throws Throwable

	{ 
	 System.out.println("Circle"); 
	
	} 
	} 
	
        class Y extends X 
	  { 
	     @Override
	     void draw(int a, float b)
	    { 
	        System.out.println("Rectangle"); 
	  } 
	  } 
	      class Z extends Y 
	    { 
	        @Override 
	       void draw(int a, float b) throws ArithmeticException
	    { 
	      System.out.println("Square"); 
	   } 
	 } 
	class Xtest
	
	{ 
	public static void main(String[] args) throws Throwable 
	{ 
	 X x = new Y(); 
	 x.draw(20, 30.5f); 
	 Y y = (Y)x; 
	 y.draw(10,2.9f); 
	 Z z = (Z)y; 
	 z.draw(20, 30f); 
	 } 
	}
	

