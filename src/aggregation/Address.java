package aggregation;

public class Address {
String vilage;
int pin;
String  dist;
public Address() {
	
}
public Address(String vilage,String dist,int pin) {
	this. vilage=vilage;
	this.pin= pin;
	this.dist=dist;
	
}


@Override
public String toString() {
	return "Address [vilage=" + vilage + ", pin=" + pin + ", dist=" + dist + "]";
	
}

}
