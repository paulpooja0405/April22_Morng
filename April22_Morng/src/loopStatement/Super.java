package loopStatement;

public class Super {
	
	int age = 20;
	String name = "pooja";
	
	public void a1()
	{
		int age = 25;
		String name = "snehal";
		System.out.println("AGE = "+age);
		System.out.println("NAME = "+name);
		System.out.println("AGE = "+this.age);
		System.out.println("NAME = "+this.name);
		
	}

	
	public static void main (String [] args)
	{
		Super j = new Super();
		j.a1();
	}
}
