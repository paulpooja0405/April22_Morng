package loopStatement;

public class LeftTrangleDown {
		
		public void a1()
		{
			for (int i = 1; i<=5; i++ ) {
				for (int j = 4; j>=i; j-- ) {
		
			
				System.out.print ("*  ");
			}
			
			System.out.println ();
			
			}
		}
		
		public static void main (String [] args)
		{
			LeftTrangleDown s = new LeftTrangleDown();
			s.a1();
		}

	}

