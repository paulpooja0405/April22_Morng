package logical_Program;

public class Star_Prog_1 {
	
	public static void main(String[]args)
	{
		for(int i =1; i<=6;i++)  		//no. of lines i= 1,2
		{
			for(int x=1;x<=i;x++)		// x=1,2
			{
			System.out.print("*");	
			}
			
			for(int y=5;y>=i;y--)			// y=4,3,2,1     4>=2
			{
				System.out.print(" ");
			}
			
			for(int z=5; z>=i;z--)			//4,3,2,1,0
			{
				System.out.print(" ");
			}
			
			for(int a=1;a<=i;a++)			// a=1,		2
			{
				System.out.print("*");
			}
			
			
			System.out.println("");
			
			
			
			
			
			
//			for(int y=1;y<=4;y++)
//			{
//			System.out.print("$");
//			}
//			
//			System.out.println("");
		}
		
		
	}
	
	

}
