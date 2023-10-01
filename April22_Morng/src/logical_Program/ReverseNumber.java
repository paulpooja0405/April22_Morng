package logical_Program;

public class ReverseNumber {
	
	int n = 584;
	int b=0;
	int c;
	public void a1()
	{
	while(n>0)
	{
	c=n%10;
	b=b*10+c;
	n=n/10;
	}
	System.out.println(b);
	}
	public static void main(String[]args)
	{
	ReverseNumber s = new ReverseNumber();
	s.a1();
	}

}
