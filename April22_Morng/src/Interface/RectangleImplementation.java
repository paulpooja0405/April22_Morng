package Interface;

public class RectangleImplementation {
	
	public void getArea() {
		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The Area of Rectangle is = " + area);
	}
	
	// Override the default methods
	public void getsides() {
		System.out.println("I have 4 sides as i am rectangle");
	}
	
	public static void main(String[] args) {
		// Regular Object 
		RectangleImplementation r = new RectangleImplementation();
		r.getArea();
		r.getsides();
		// Upcasting Object 
		PolygonInterface p = new RectangleImplementation();
		p.getArea();
		p.getsides();
		
		
	}


}
