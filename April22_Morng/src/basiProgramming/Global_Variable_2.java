package basiProgramming;

public class Global_Variable_2 {

	 char a = 'A';
     char b = 'Z';
     //Main Method
     public static void main ( String [] args )

     {
	    String a = " GLOBAL VARIABLE 2 ";
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




