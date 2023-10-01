package basiProgramming;

public class Personal_Info {
	
	String Name ;
    String email ;
	byte Age ;
	long Mobileno ;
	
	     Personal_Info (){
		 Name = "POOJA SANDESH MORE";
	     email = "pooja111@mail.com";
		 Age = 25;
		 Mobileno = 1234567897l; 
	}
	
	     public void pooja(){
		 System.out.println ("Name = "+Name);
		 System.out.println ("email = "+email);
	   	 System.out.println ("Age = "+Age);
		 System.out.println ("Mobileno = "+Mobileno);
	}
        
	     public static void main (String [] args) {
		 Personal_Info k = new Personal_Info();
		 k.pooja();
	
	}
		
}
	
