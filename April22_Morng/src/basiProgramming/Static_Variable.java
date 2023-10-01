package basiProgramming;

public class Static_Variable {
	
	  static int a = 1111;
	  static int b = 2222;
	   
	
	 //Main Method
	public static void main ( String [] args )
	
	{
		System.out.println(a);
		System.out.println(b);
		
		Home();
		
		 Static_Variable p = new  Static_Variable();
		
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




