package basiProgramming;

public class New_constructor {
	

	//declare
	String Name;
	String Mobileno;
	String Dob;
	byte Age;

     // initalization
	public New_constructor() {
		
		Name = " Shivansh More ";
		Mobileno = "8824587125";
		Dob = "10 may 2000";
		Age = 20;
		
		System.out.println ("Name = " + Name + "\n" + "Mobileno = " + Mobileno +"\n"+ "Dob = " + Dob +"\n" + "Age = "+ Age  );
		
	}
	
     public New_constructor(int a) {
		
		Name = " Rudra Gore ";
		Mobileno = "9054872154";
		Dob = "10 june 2000";
		Age = 10;
		
		System.out.println ("Name = " + Name + "\n" + "Mobileno = " + Mobileno +"\n"+ "Dob = " + Dob +"\n" + "Age = "+ Age  );
		
	}
	
     public New_constructor(int c,int d) {
 		
 		Name = " Parth Gore ";
 		Mobileno = "9054872154";
 		Dob = "10 jan 2000";
 		Age = 10;
 		
 		System.out.println ("Name = " + Name + "\n" + "Mobileno = " + Mobileno +"\n"+ "Dob = " + Dob +"\n" + "Age = "+ Age  );
 		
 	}
	public static void main (String [] args) {
		
		 new New_constructor();
		 new New_constructor(500);
		 new New_constructor(60, 20);
		 
	}
}

  
