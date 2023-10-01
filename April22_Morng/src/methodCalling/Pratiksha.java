package methodCalling;

public class Pratiksha {
	
	public static void pratiksha()
	{
		System.out.println("I WANT TO BY RING");
	}
	public static void pratiksha(String car)
	{
		System.out.println("I WANT TO BY car "+ car);
	}
	public void sonali (String name, int a )
	{
	System.out.println(" MY NAME IS = " + name);
	System.out.println(" PRINT VALUE = " + a);
	}
	public void sonali (String house )
	{
	System.out.println(" MY HOUSE NAME IS = " + house);
	}
	 
	public static void main (String [] args)
	{
		pratiksha ();
		Pratiksha x = new Pratiksha();
		x.sonali("POOJA",100);
		x.sonali("SAMARTHKRUPA");
	}
 
}
