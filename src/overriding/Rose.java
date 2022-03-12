package overriding;

import java.io.IOException;

public class Rose {
	
	void color(char r)
	{ 
	 System.out.println("Red"); 
	 } 
	} 
	 class Marigold extends Rose
	{ 
	@Override 
	void color(char m) throws NullPointerException
	{ 
	 System.out.println("Orange"); 
	 } 
	} 
	 class Sunflower extends Marigold 
	{ 
	@Override 
	protected final void color(char s)
	{ 
	 System.out.println("Yellow"); 
	 } 
	}


