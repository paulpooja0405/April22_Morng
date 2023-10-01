package methodCalling;

public class MethodCallingwithinclass {
	//static mtd
	public static void a1()
	
	{
		System.out.println ("Hello Students");
	}
	//non stati mtd
	public void b1()
	
	{
		System.out.println ("Hello sir");
		
	}
	//main mtd
	public static void main (String []args )
	{
		System.out.println("ALL");
		a1();// mtd name signature followed by semicolon
		MethodCallingwithinclass x = new MethodCallingwithinclass();
		x.b1(); // classname referance variable = new classname signature followed by semicolon
		MethodCallingOutsideClass .pooja ();
		MethodCallingOutsideClass z = new MethodCallingOutsideClass();
		z.roja();
		Pratiksha w = new Pratiksha();
		w.sonali("GURUKRUPA");
		w.sonali("pooja", 100);
		Pratiksha.pratiksha("Aura");
	}

	

}
