package basiProgramming;

public class Examform {
	// declare
	String Name;
	int Examfee;
	
	// initialization
	
	Examform(String a,int b)
	{
	  Name = a;
	  Examfee = b;
	  System.out.println(Name);
	  System.out.println(Examfee);
	 
	}
	
	public void a1()
	{
		System.out.println(Name);
	}

	public void h1()
	{
		System.out.println(Examfee);
	}
	
	public static void main (String [] args)
	{
		System.out.println(" PRINT FORM ");
		
		
	  Examform sona = new Examform("pooja",200);
		sona.a1();
		sona.h1();
		
	}

}
