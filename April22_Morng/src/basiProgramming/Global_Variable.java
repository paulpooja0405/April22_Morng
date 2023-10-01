package basiProgramming;

public class Global_Variable {
	
	             static int a = 200;
	             int b = 400;
	        //Main Method
			public static void main ( String [] args )
			
			  {
				String a = " GLOBAL VARIABLE ";
				System.out.println("I AM PRINTING"+a);
			  
				Global_Variable m = new Global_Variable();
				
				m.GLOBAL();
			}
			
	        
			
			// Non Static Method
			
			public void GLOBAL ()
			
			{
			
				System.out.println (a);
				System.out.println (b);
			}
			
		}




