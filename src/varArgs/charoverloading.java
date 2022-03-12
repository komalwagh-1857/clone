package varArgs;

public class charoverloading {
public static void print(int[]i) {

	System.out.println("ArraytoString(i)");
}
public static void print(Object o) {
	System.out.println("Object method resolved");
}
public static void main (String[]args) {
	int[]x={10,20,30};
	char a = 0;
	char[]y= {a}; 
	print(x);
}
}
