package ControlStatement;

public class IfStatement {

	int a;
	IfStatement (int b)
	{
		a =b;
	}
		
		public void s1 ()
		{
			if (a>=0)
			{
				System.out.println ("True");
			}
			  }
		public static void main (String [] args)
	{
		
			IfStatement k = new IfStatement(1);
		k.s1();
	}
	
	

}


