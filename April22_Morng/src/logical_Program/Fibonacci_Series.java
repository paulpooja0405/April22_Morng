package logical_Program;

public class Fibonacci_Series {
	
	int n=10;
	int a=0;
	int b=1;
	int c;
	int i;
	
	public void a1()
	{
		System.out.println("Fibpnacci Series");
		while (n>i)
		{
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
	
	public static void main (String [] args)
	{
		Fibonacci_Series k = new Fibonacci_Series();
		k.a1();
	}

}
