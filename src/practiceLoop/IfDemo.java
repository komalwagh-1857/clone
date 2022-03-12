package practiceLoop;

public class IfDemo {
public static void main(String[] args, Object resultUsingTernaryOperator) {
	int marks=70;
	String result="";
	boolean res;
	if(marks==80)
	{
	result="First Class";
	}
	else {
		result="Not first class";
	}
	resultUsingTernaryOperator=(marks==80)?
			"first class":"Not first class";//Ternary operator
	System.out.println(result);
	System.out.println(resultUsingTernaryOperator);
}
}