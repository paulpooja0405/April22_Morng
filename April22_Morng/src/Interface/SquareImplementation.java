package Interface;

public class SquareImplementation implements PolygonInterface {
	
	public void getArea() {
		int area = length * length;
		System.out.println("The Area of Square is = " + area);
	}
	
	public static void main(String[] args) {
		int a = length;
		System.out.println(a);
		SquareImplementation n = new SquareImplementation();
		n.getArea();
		n.getsides();
		PolygonInterface.poly();
	}

}
