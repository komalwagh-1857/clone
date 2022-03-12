package enumjava;

public class EnumExample2 {
public enum Season{WINTER,SPRING,SUMMER,FALL}
public static void main (String []args) {
	for(Season s:Season.values()) {
		System.out.println(s);
	}
	System.out.println("value of WINTER is:"+Season.valueOf ("WINTER"));
	System.out.println("Index of WINTER is:"+Season.valueOf ("WINTER").ordinal());
	System.out.println("INDEX of SUMMER is:"+Season.valueOf ("SUMMER").ordinal());


}

}

