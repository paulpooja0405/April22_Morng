package loopStatement;

public class Super_1 extends Super {
	
	int age = 55;
	String name = "pragati";
	
	public void b1()
	{
		int age = 40;
		String name = "rajani";
		System.out.println("AGE = "+age);
		System.out.println("NAME = "+name);
		System.out.println("AGE = "+this.age);
		System.out.println("NAME = "+this.name);
		System.out.println("AGE = "+super.age);
		System.out.println("NAME = "+super.name);
		
	}

	
	public static void main (String [] args)
	{
		Super_1 k = new Super_1();
		k.b1();
		k.a1();
	}
}
