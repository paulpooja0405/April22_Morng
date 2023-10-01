package basiProgramming;

public class Static_NonStatic {
	//Main Method
	public static void main ( String [] args )
	
	{
		System.out.println(" MAIN METHOD ");
		
		addition();
		
		Static_NonStatic poonam = new Static_NonStatic();
		
		poonam.ABC();
		poonam.VMC();
	}
	

	// Static Method 
	public static void addition()
	
	{
		System.out.println (" Static Method ");
	}
	
	// Non Static Method
	
	public void ABC ()
	
	{
		System.out.println (" NON STATIC METHOD ");
	}
	
	public void VMC ()
	{
		System.out.println (" HI NON STATIC NEW ");
	}
	

}
