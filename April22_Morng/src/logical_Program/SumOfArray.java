package logical_Program;

public class SumOfArray {
	
	public static void main (String [] args)
	{
		int a[]= {5,4,2,6,8};
		int sum=0;
		
//		for (int i=0; i<=a.length-1; i++)
//		{
//			sum = sum+a[i];
//		}
		
		// enhance for loop
		
		for (int value : a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Array elements="+sum);
	}

}
