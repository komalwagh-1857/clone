package overriding;

public class PumpkinDemo {

		 
	    public static void main(String[] args) {
	        Shape s = new Circle();
	 
	        s.draw();
	        s.fill();
	    }
	}
	 
	class Shape{
	    public void draw()
	    {
	        System.out.println("Shape");
	    }
	     
	    public void fill()
	    {
	        System.out.println("Shape Filled with color");
	    }
	 
	}
	 
	class Circle extends Shape{
	    public void draw()
	    {
	        System.out.println("Circle");
	    }
	}
	 
	class Square extends Shape{
	    public void draw()
	    {
	        System.out.println("Square");
	    }
	}
	 
	class Hexagon extends Shape{
	    public void draw()
	    {
	        System.out.println("Hexagon");
	    }
	}

