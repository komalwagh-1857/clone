package overloading;

import java.util.Arrays;

public class CharOverloading {
public static void print(int[]i) {
	System.out.println(Arrays.toString (i));
	
}
	public static void print(Object o) {
		System.out.println("object method resloved");
	}
	public static void print(char[]c) {
		System.out.println("char method resloved");
	
	}
	public static void main(String[] args) {
		int[]x= {10,20,30};
		char[]y= {'a','b','c'};
		print(y);
	}
}


