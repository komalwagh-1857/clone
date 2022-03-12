package overriding;

import java.io.IOException;

public class One {
	
	void m1() throws Throwable
	{ 
	 System.out.println("m1-One"); 
	 } 
	} 
	class Two extends One 
	{ 
	@Override 
	protected void m1() throws Exception
	{ 
	 System.out.println("m1-Two"); 
	 } 
	}
	 
	class Three extends Two 
	{ 
	@Override 
	public final void m1() throws IOException
	{ 
	 System.out.println("m1-Three"); 
	 } 
	} 
	class MyTest 
	{ 
	public static void main(String[] args) throws Throwable 
	{ 
	 One o = new Two(); 
	  o.m1(); 
	 Two t = new Three(); 
	  t.m1(); 
	 Three th = new Three(); 
	  th.m1(); 
	 } 
	}


