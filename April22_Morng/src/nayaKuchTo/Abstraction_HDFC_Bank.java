package nayaKuchTo;

public class Abstraction_HDFC_Bank extends Abstraction_Bank {

	public static void account() // we can right static method in abstraction but with complete method (Incomplete static method we cant right)
	{
		System.out.println ("I Have Account");
	}
    final void jointaccount()      
	{
		System.out.println("Joint My Account With Fathers Account");
	}

	void moneyMarketaccount()
	{
		System.out.println("Money Market Account It Is New For Me");
	}
	
	public static void main (String [] args)
	{
		Abstraction_HDFC_Bank h = new Abstraction_HDFC_Bank();   // Hirarical Inheritance
		h.jointaccount();
		h.moneyMarketaccount();
		h.currentaccount();
		h.savingaccount();
		h.account();
	}
	


}
