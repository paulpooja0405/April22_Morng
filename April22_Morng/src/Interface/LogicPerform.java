package Interface;

public class LogicPerform implements LogicInterface{
	
	int n = 212;
	int a=n;
	int b=0;
	int c;     
	
   @Override
  	public void reverseNumber() 
	{
		
		while(n>0)
		 {
			 c=n%10;        //212%10=2,1
			 b=b*10+c;      //0*10+2=2,21
			 n=n/10;        //212/10=21,2
		 }
		if(b==a)
		{
			System.out.println("This is palindrome Number");
		}
		else
		{
			System.out.println("This is not palindrome number");
		}
		
       
   }

}
