package logical_Program;

public class AverageNumber {
	
	// find average number..
	//total:a+b+c+d+e;
	//total/total no. .....a+b+c+d+e/5=avg.number
	
	int a=1120;
	int b=5120;
	int c=555555;
	int d=12121;
	
	public void a1()
	{
		int sum=a+b+c+d;
		System.out.println("TOTAL MARK:"+sum);
		
		double average=sum/4;
		System.out.println("AVERAGE:"+average);
	}
	
	public static void main (String [] args)
	{
		AverageNumber p = new AverageNumber();
		p.a1();
	}

}
