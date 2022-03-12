package polimorphismOverloading;

public class Overloaded {
public static void msg(long a,int b) {
	System.out.println("Hello");
	
} 
public static void msg(int a,long b) {
	System.out.println("Hi");
}
public static void main (String[]args) {
	//msg(5,10)
	//msg(10,11);//
}

}
