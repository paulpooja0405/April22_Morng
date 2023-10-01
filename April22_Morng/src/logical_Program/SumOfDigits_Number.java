package logical_Program;

public class SumOfDigits_Number {
	
	public static void main (String [] args)
	{
		int num=548;
		int sum=0;
		
		while (num>0) 
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("Sum of digit num="+sum);
		
	}

}
