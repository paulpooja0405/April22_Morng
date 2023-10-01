package methodCalling;

public class RelationalOperator {
	public static void main (String [] args)
	{
		int a = 100;
		int b = 200;
		int c = 800;
		int d = 600;
		System.out.println(a>c); // F
		System.out.println(b<d); // T
		System.out.println(a>=b); //F
		System.out.println(a<=c); //T
		System.out.println(b==c); //F 
		System.out.println(d==a); //F
		System.out.println(a!=d); //T 
		System.out.println(a!=c); //T
		
		RelationalOperator y = new RelationalOperator();
		ShiftOperator g = new ShiftOperator();
		// r is instance variable of RelationalOperator();
		System.out.println(y instanceof RelationalOperator);
		
		int p = 120;
		int q = 200;
		int r = 100;
		int s = 500;
		System.out.println(p<s); // T
		System.out.println(p>s); // F
		System.out.println(d<=c); //T
		System.out.println(b<=a); //F
		System.out.println(a==c); //F 
		System.out.println(b==a); //F
		System.out.println(a!=d); //T 
		System.out.println(a!=c); //T
	}

}
