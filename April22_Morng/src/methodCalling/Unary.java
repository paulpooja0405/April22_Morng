package methodCalling;

public class Unary {
	
	public static void main (String [] args)
	{
		int a = 100;
		System.out.println (a++);
		System.out.println (a);
		

		int b = 50;
		System.out.println (b);
		System.out.println (b--);
		System.out.println (b--);
		
		int c = 10;
		System.out.println (--c);
		System.out.println (--c);
		

		int d = 20;
		System.out.println (++d);
		System.out.println (++d);
		
		int m = 10;
		System.out.println (-m);
		System.out.println (-m);
		

		int n = 20;
		System.out.println (+n);
		System.out.println (+n);
		
		int k = 10;
		System.out.println (~k);
		System.out.println (~k);
		

		boolean p = 20>10;
		System.out.println (!p);
		System.out.println (p);
		
	}

}
