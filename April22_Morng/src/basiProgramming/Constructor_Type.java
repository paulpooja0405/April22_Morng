package basiProgramming;

public class Constructor_Type {


	String Name ;
    String email ;
	byte Age ;
	long Mobileno ;
		

	 Constructor_Type()
	 {
       Name = "Pranali Raju Kadam";
	   email = "pranali102@mail.com";
	   Age = 25;
	   Mobileno = 8864957235l; 
		 
	   System.out.println ("Name = "+ Name + "\n" + "email = " + email +"\n" + "Age = "+ Age + "\n" + "Mobileno = "+ Mobileno);
   
	}
    public Constructor_Type(int a){
	 System.out.println ("value of a = "+a);
	 System.out.println ("one arg constructor");

 	     Name = "pooja more";
	     email = "pooja102@mail.com";
		 Age = 25;
		 Mobileno = 9685957235l; 
		 System.out.println ("Name = "+ Name + "\n" + "email = " + email +"\n" + "Age = "+ Age + "\n" + "Mobileno = "+ Mobileno);
		   
    }
   
     public static void main (String [] args) {
    	 new Constructor_Type();
    	 new Constructor_Type(200);


   }
} 	
   

