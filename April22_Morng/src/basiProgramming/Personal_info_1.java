package basiProgramming;

public class Personal_info_1 {
	
	String Name ;
    String email ;
	byte Age ;
	long Mobileno ;
		
	
	
    Personal_info_1(){
    	
    	Name = "Pranali Raju Kadam";
	     email = "pranali102@mail.com";
		 Age = 25;
		 Mobileno = 8864957235l; 
    }

    public void Pranali(){
	 System.out.println ("Name = "+Name);
	 System.out.println ("email = "+email);
  	 System.out.println ("Age = "+Age);
	 System.out.println ("Mobileno = "+Mobileno);
   }
   
     public static void main (String [] args) {
     Personal_info_1 s = new  Personal_info_1();
	 s.Pranali();

   }
} 	
   

