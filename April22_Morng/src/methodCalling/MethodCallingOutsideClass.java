package methodCalling;

public class MethodCallingOutsideClass {
	
	public static void pooja ()
	{
		System.out.println("MI PAN AAHE");
	}
    public void roja ()
    {
    	System.out.println("TU PAN AAHE");
    }
    public static void main (String [] args)
    {
    	System.out.println("SAGLE AAHET");
    	pooja();
    	MethodCallingOutsideClass a = new 	MethodCallingOutsideClass();
    	a.roja();
    	MethodCallingwithinclass.a1(); // static mtd calling another class
    	MethodCallingwithinclass y = new MethodCallingwithinclass();
    	y.b1();
    	
    }
}
