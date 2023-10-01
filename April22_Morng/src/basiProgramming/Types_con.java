package basiProgramming;

public class Types_con {
	


	String Name ;
    String email ;
	byte Age ;
	long Mobileno ;
		

	public Types_con(){
    	
    	Name = "Pranali Raju Kadam";
	     email = "pranali102@mail.com";
		 Age = 25;
		 Mobileno = 8864957235l; 
		 
		 System.out.println ("Name = "+ Name + "\n" + "email = " + email +"\n" + "Age = "+ Age + "\n" + "Mobileno = "+ Mobileno);
   
	}
   
    
    public Types_con(int a){
   	 System.out.println ("value of a = "+a);
   	 System.out.println ("one arg constructor");

    	     Name = "pooja more";
   	     email = "pooja102@mail.com";
   		 Age = 25;
   		 Mobileno = 9685957235l; 
   		 
   		 System.out.println ("Name = "+ Name + "\n" + "email = " + email +"\n" + "Age = "+ Age + "\n" + "Mobileno = "+ Mobileno);
   		   
       }
    
    public Types_con(int a,String b){
   	 System.out.println ("value of a = "+a);
   	 System.out.println ("value of a = "+b);
   	 System.out.println ("Two arg constructor");

    	     Name = "sandesh more";
   	     email = "sandesh102@mail.com";
   		 Age = 25;
   		 Mobileno = 9685957235l; 
   		 System.out.println ("Name = "+ Name + "\n" + "email = " + email +"\n" + "Age = "+ Age + "\n" + "Mobileno = "+ Mobileno);
   		   
       }
   
     public static void main (String [] args) {
    	 new Types_con();
    	 new Types_con(200);
    	 new Types_con(10,"hello");


   }
} 	
   


