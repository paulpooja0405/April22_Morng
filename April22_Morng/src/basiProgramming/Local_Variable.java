package basiProgramming;

public class Local_Variable {
	    //Main Method
		public static void main ( String [] args )
		
		{
			String a = " LOCAL VARIABLE ";
			System.out.println("I AM PRINTING"+a);
			
			addition();
			
			Local_Variable poonam = new Local_Variable();
			
			poonam.ABC();
		}
		
        // Static Method 
		public static void addition ()
		
		{
			int a = 1000;
			System.out.println (a);
		}
		
		// Non Static Method
		
		public void ABC ()
		
		{
			char a = 'Z';
			System.out.println (a);
		}
		
	}


