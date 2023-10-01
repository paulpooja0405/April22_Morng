package basiProgramming;

public class Flow {
	
	int a ;
	
	Flow (int b)
	{
		a = b ;
	}
	public void p1()
	{
		if (a>=0);
		System.out.println("POSITIVE NOUMBER");
	}

	public static void main(String [] args)
	{
		Flow k = new Flow(-1);
		k.p1();
	}
}
