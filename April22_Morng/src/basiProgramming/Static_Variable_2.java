package basiProgramming;

public class Static_Variable_2 {
	

	  static float a = 12.00f;
	  static long b = 2222;
	   
	
	 //Main Method
	public static void main ( String [] args )
	
	{
		System.out.println(a);
		System.out.println(b);
		
		Home();
		
		Static_Variable_2 p = new Static_Variable_2();
		
		p.pooja();
	}
	
  // Static Method 
	public static void Home ()
	
	{

		System.out.println(a);
		System.out.println(b);
		
	}
	
	// Non Static Method
	
	public void pooja ()
	
	{

		System.out.println(a);
		System.out.println(b);
		
	}
	
}


