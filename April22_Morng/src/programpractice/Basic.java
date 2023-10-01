package programpractice;

public class Basic {
	
	static String a = "pooja";
	static int b = 500;
	//static method
	//local variable
	public static void aa () {
		String a = "pooja";
		int b = 500;
		System.out.println(a );
		System.out.println(b );
	}
	//non static method
	//instance variable
	public void ram() {
		System.out.println (a);
		System.out.println(b);
	}
	//main method
	public static void main (String [] args) {
		
		System.out.println("THIS IS BASIC");
		aa();
		Basic sp = new Basic ();
		sp.ram();
	}
}
