package loopStatement;

public class Even_Odd_Numbers {
	//Even & odd number from 1100 to 1900
	public void a1()
	
	{
		
	for (int a = 1100; a<=1900; a++)
	{
		if (a%2==0)
		{
		System.out.println("EVEN NUMBER = "+a);
	
		}
	}
		
		for (int a= 1100; a<=1900; a++) 
		{
		if  (a%2!=0)
		
		  {
			System.out.println ("ODD NUMBER = "+a);
		  }
	}
	}

	
	public static void main (String [] args)
	{
		Even_Odd_Numbers s = new Even_Odd_Numbers();
		s.a1();
	}

}
