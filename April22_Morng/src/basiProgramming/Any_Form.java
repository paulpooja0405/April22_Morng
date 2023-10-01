package basiProgramming;

public class Any_Form {
	// declare
	String Name ;
	int Age ;
	String Address ;
	long Mobileno ;
	
    // initialise
	Any_Form (String a,int b,String c,long d)
	{
		Name = a;
		Age = b;
		Address = c;
		Mobileno = d;
	}
	
	public void a1 ()
	{
		System.out.println ("Name ="+Name);
		System.out.println ("Age ="+Age);
		System.out.println ("Address ="+Address);
		System.out.println ("Mobileno ="+Mobileno);
		
	}
	public static void main (String [] args)
	{
		Any_Form k = new Any_Form ("POOJA",20,"SHOLAPUR",2548761254l);
		k.a1();
	}
}
