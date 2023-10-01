package nayaKuchTo;

public class Animal_Abstract_sub extends Animal_Abstraction {
	
	
	public void welcome () 
	{
		System.out.println("welcome in java");
		System.out.println("This is concrete class of abstract method");
	}
	
	public static void home ()
	{
		System.out.println ("I want to go home");
	}
	public static void main(String[] args) {
		
		Animal_Abstract_sub a = new Animal_Abstract_sub();
		a.eat();
		a.run();
		a.makingSound();
		a.shape();
		a.survive();
		a.welcome();
		a.home();
	}

	void makingSound() {
		System.out.println("Bho Bho");
	}

	
	void shape() {
		System.out.println("Shape");
	}

	void survive() {
		
		System.out.println("servive");
	}

}
