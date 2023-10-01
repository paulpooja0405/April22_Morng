package Interface;

public class D_Mart_B extends D_Mart {
	
	public static void main (String [] args)
	{
		D_Mart_B s = new D_Mart_B();
		s.cream();
		s.soap();
		s.sugar();
		s.tea();
		
		D_Mart_A a = new D_Mart_A();
		a.cream();
		a.soap();
		a.sugar();
		a.tea();
	
	}

}
