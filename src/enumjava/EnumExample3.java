package enumjava;

public class EnumExample3 {
enum Day{SUNDAY,MONDAY,TUSEDAY,WEDSEDAY,THURSEDAY,FRIDAY,SATURDAY}
public static void main(String[] args) {
	
Day day=Day.MONDAY;
switch(day) {
case SUNDAY:
	System.out.println("SUNDAY");
	break;
case MONDAY:
	System.out.println("MONDAY");
	break;
	default:
		System.out.println("other Day");
}
}
}
