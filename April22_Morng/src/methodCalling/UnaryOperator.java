package methodCalling;

public class UnaryOperator {
	
	public static void main (String [] args)
	{
		System.out.println("POSTFIX");
		
		int a = 500;
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

	
	    System.out.println("POSTFIX");
	    
	    int b = 200;
	    System.out.println(b--);
	    System.out.println(b);
	    System.out.println(b--);
	    System.out.println(b--);
	    System.out.println(b--);
	    System.out.println(b--);
	    
	    
       System.out.println("PREFIX");
	    
	    int m = 150;
	    System.out.println(--m);
	    System.out.println(m);
	    System.out.println(--m);
	    System.out.println(--m);
	    System.out.println(--m);
	    System.out.println(m);
	    
	    System.out.println("PREFIX");
	    
	    int x = 285;
	    System.out.println(+x);
	    System.out.println(+x);
	    System.out.println(x);
	    System.out.println(+x);
	    System.out.println(x);
	    System.out.println(+x);
	    
        System.out.println("PREFIX");
	    
	    int y = 20;
	    System.out.println(y);
	    System.out.println(-y);
	    System.out.println(y);
	    System.out.println(-y);
	    System.out.println(y);
	    System.out.println(y);
	    
        System.out.println("PREFIX N POSTFIX");
	    
	    int z = 95;
	    System.out.println(~z);
	    System.out.println(z);
	    System.out.println(~z);
	    System.out.println(z);
	    System.out.println(z);
	    System.out.println(~z);
	    
        System.out.println("PREFIX N POSTFIX");
	    
	   boolean p = 88>5;
	    System.out.println(!p);
	    System.out.println(p);
	    System.out.println(!p);
	    System.out.println(p);
	    System.out.println(p);
	    System.out.println(!p);
	}
}
