package ControlStatement;

public class Nested_If {
	
	int a =100;
	int b =50;
	int c =10;
	int d =900;
	
	public void a1()
	{
		if (a>b)
		{
			System.out.println ("True");
		
		if (d<a)
		{
			System.out.println ("False");
		}
		}
		System.out.println ("Smart");
	}
	
	public static void main (String [] args)
	{
		Nested_If g = new Nested_If();
		g.a1();
	}
}
