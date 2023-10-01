package logical_Program;

public class Star_Prog_2 {
	
	public static void main(String[]args)
	{
		for(int i=1; i<=5;i++)				//1,	2	3	4	5
		{
			for(int j=5; j>=i; j--)			// 5 	5	5	5	5
			{
				System.out.print("a");
			}
			
			for(int k=1; k<=i;k++)			// i=2 , K=3
			{
				System.out.print("*");
			}
			
			for(int b=2;b<=i;b++)		//2
			{
				if(i>1)
				System.out.print("*");
			}
			
			for(int a =5; a>=i;a--)
			{
				System.out.print("a");
			}
			
			
			
			System.out.println("");
		}
		
		
		
	}

}
