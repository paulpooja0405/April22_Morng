package basiProgramming;

public class This_Keyword {
  
	int A = 50;
	String B = " THIS KEYWORD ";
	
	public void a () {
	
		int A = 100;
		String B = "USE THIS KEYWORD";
		
	System.out.println ("value");
	System.out.println (A);
	System.out.println (B);
	System.out.println (this.A);
	System.out.println (this.B);
	}
	
	public static void main (String [] args) {
		
		
		This_Keyword pooja = new This_Keyword ();
		pooja.a();
		
		 
		
	}

}
