package overloading;

public class NullTest {
public static void method(Object obj) {
	System.out.println("method with param type-object");
}


public static void method(String str,Object obj) {
	System.out.println("method with param type-String object");
}
public static void main(String[] args) {
	method(null,null);
	
}
}
 