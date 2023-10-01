package nayaKuchTo;

public class Casting {
	// primitive type casting 
	// 1) Implicite type casting                        lower to higher
	public static void main (String [] args)
	{
		byte a = 127;
		System.out.println(a);
		short b = a;  
		
		long c = 44586;
		float d = c;
		System.out.println(d);
		
		int g = 5354;
		long j = g;
		System.out.println(j);
		
		
		
		//2)Explicite type casting                        higher to lower 
		                                    // convert higher datatype information into lower dataytype information
		int i = 127;                                //also called as Narrowing casting or Forcefully Casting or Type casting
		short p = (short)i ;
		System.out.println(p);
		
		float k = 864;
		byte m = (byte)k;
		System.out.println(m);
		
		double o = 120;
		float f = (float)o;
		System.out.println(f);


		


	}

}
