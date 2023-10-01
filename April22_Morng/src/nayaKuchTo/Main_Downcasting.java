package nayaKuchTo;

public class Main_Downcasting {
	
	public static void main(String [] args)
	{
		Downcasting_Father o = new Downcasting_Son();
		
	     o.property();
	     o.bike();
		
	     Downcasting_Son p = new Downcasting_Son();
	     p.bike();
	     p.property();
	}

}
