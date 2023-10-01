package methodCalling;

public class Logicalbitwise {
	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		int c = 800;
		int d = 50;                                             
		System.out.println(a<c&b>c);//f  f =f              Bitwise &, bitwise|
		System.out.println(c<d&d>a);//f  t =f
		System.out.println(a>c|b<c);// f+ t =t
		System.out.println(c<b|d>c);//f + f = f
		
		System.out.println(a<c&&b>c);//f  f =f            Logical and ,  logical or
		System.out.println(c<d&&d>a);//f  t =f
		System.out.println(a>c||b<c);// f+ t =t
		System.out.println(c<b||d>c);//f + f = f
	}

}
