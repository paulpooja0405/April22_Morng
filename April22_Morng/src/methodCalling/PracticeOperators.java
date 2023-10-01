package methodCalling;

public class PracticeOperators {
	public static void main (String [] args)
	{
		
	
	// POSTFIX
	int a = 20;
	int b = 45;

	
	System.out.println(a++);
	System.out.println (a);
	System.out.println (b);
	System.out.println (b++);
	
	System.out.println(a--);
	System.out.println (a--);
	System.out.println (b);
	System.out.println (b--);
	
	
	

	// PREFIX
	int c = 20;
	int d = 45;
	
	System.out.println(--c);//19
	System.out.println (c);//19
	System.out.println (--d);//44
	System.out.println (--d);//43


	System.out.println(++c);//20
	System.out.println (c);//20
	System.out.println (d);//43
	System.out.println (++d);//44                               // UNARY OPERATOR
	
	int g = 100;
	int h = 200;
	
	System.out.println(+g);
	System.out.println(g);
	System.out.println(-h);
	System.out.println(-h);
	
	int e = 50;
	int f = 40;
	
	System.out.println(~e);
	System.out.println(~f);
	System.out.println(e);
	
	boolean k = 100<200;
	System.out.println(k);
	System.out.println(!k);
	
	//////////////////////////////////////////////////////
	
	float q = 100;
	float w = 15;
	
	System.out.println(q+w);//25
	System.out.println(q-w);//-15
	System.out.println(q*w);//100                   ARITHMATIC OPERATOR
	System.out.println(q/w);//0
	System.out.println(q%w);//0
	
	
	
	int p = 5;
	
	System.out.println(5<<2);//5*2^2 = 20
	System.out.println(5<<4);//5*2^4=80                      SHIFT OPERATOR
	System.out.println(5>>2);//5/2^2=4
	System.out.println(5>>5);//5/2^5
	
	

}
}