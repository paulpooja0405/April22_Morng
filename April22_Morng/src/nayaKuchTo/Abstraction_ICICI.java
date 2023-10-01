package nayaKuchTo;

public final class Abstraction_ICICI extends Abstraction_HDFC_Bank {
	
	// final void jointaccount()      // we cant use final method anywhere also we cant use final class also 
	//	{
	//		System.out.println("Joint Account It Is The Best Option");
	//	}
	 

	 void moneyMarketaccount()
		{
			System.out.println("Money Market Account ");
		}
	 
	 public static void main (String [] args)
	 {
		 Abstraction_ICICI k = new Abstraction_ICICI();
		 k.currentaccount();
		 k.jointaccount();
		 k.moneyMarketaccount();
		 k.savingaccount();
		 k.account();
		 
	   // final int a=100;       //We cant use final variable again
		// a = 40;
		 
		// System.out.println("Print = "+ a);
		
	
	 }

}
