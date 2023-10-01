package basiProgramming;

public class Staticnonsta {
	static String a = "pooja";
	static char b = 'A';
	
	public static void main (String [] args)
	{
		System.out.println (a);
		System.out.println (b);
		
		add();
		Staticnonsta p = new Staticnonsta();
		p.mad();
	}

	
     public static void add()
     {
    	System.out.println (a);
 		System.out.println (b);
     }
     
     public void mad()
     {
    	System.out.println (a);
 		System.out.println (b);
     }
}
