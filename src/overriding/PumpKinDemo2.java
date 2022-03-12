package overriding;

public class PumpKinDemo2 {
	 public static void main(String[] args){
	        Parent p = new Child();
	        p.testMethod();
	    }
	}
	 
	class Parent{
	    public Number testMethod()
	    {
	        System.out.println("Parent");
	        return 0;
	    }
	}
	 
	class Child extends Parent{
	    public Integer testMethod() 
	    {
	        System.out.println("Child");
	        return 0;
	    }
	}

