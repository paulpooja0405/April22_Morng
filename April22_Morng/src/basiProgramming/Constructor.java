package basiProgramming;

public class Constructor {

	String Name;
	byte age;
	
	Constructor ()
	{
		Name = "pooja more";
		age = 25;
		System.out.println("Name = "+ Name );
		System.out.println ("age = "+age);
	}
	Constructor (int age)
	{
	System.out.println("Print value of " + age);
	
	}
	
	public static void main(String [] args)
	{
		 new Constructor ();
		 new Constructor (10);
	}

}


