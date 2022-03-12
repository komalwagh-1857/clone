package interfaceObject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape triangle =new Triangle();
triangle.area();
//Anonymous implementation
Shape square =new Shape () {

	@Override
	public void draw() {
		System.out.println("drawing square");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int area() {
		System.out.println("calculating area of square!!!");

		// TODO Auto-generated method stub
		return 0;
	}
};
square.draw();
	square.area();
	}
}

		
		
		
		
		

