package methodCalling;

public class ShiftOperator {
	public static void main (String [] args)
	{
		// << - LEFT SIDE OPERATOR *n^n
		// >> - RIGHT SIDE OPERATOR
		int a = 10;
		System.out.println(a<<2); // 10*2^2 = 40
		System.out.println(a<<4); // 10*2^4 = 160
		System.out.println(a<<2);
		System.out.println(a<<2);
		
	
		System.out.println(a>>4); // 10/2^2 = 0
		System.out.println(a>>2); // 10/2^4 = 2
		System.out.println(a>>5);
		System.out.println(a>>2);
		
		
	}

}
