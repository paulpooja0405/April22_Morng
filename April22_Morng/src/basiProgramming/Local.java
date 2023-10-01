package basiProgramming;

public class Local {
	static int A = 11; // global
	static char v = 'P';
	
	public static void main ( String [] args) {
		
		String a = "HELLO WORLD";
	
		System.out.println(a);
		System.out.println(A);
		System.out.println(v);
		
		Local kkk = new Local();
		kkk.d();
	}
	
	public void d () {
		
		System.out.println ("this is better");
		System.out.println(A);
		System.out.println(v);
	}

}
