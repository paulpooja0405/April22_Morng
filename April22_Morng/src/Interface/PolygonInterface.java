package Interface;

public interface PolygonInterface {
	

	// Java 8 By Default = Public, Abstract, Default, private, static
	// By Default variables are = static, complete & Final
	
	int length = 5; // static variable 
	
	void getArea();
	
	// Default
	default void getsides() {
		System.out.println("I can get sides of a polygon");
		math();
	}
	
	private void math() {
		System.out.println("Welcome in Java's Mathematics");
	}
	
	public static void poly() {
		System.out.println("This is the Interface of PolygonInterface");
	}

}
