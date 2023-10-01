package nayaKuchTo;

public class Abstraction_SBI_Bank extends Abstraction_Bank{
	  // subclass also we can call it as a concrete class
	public void fdaccount()         
	{
		System.out.println("I Want To Open FD Account");
	}
	public static void main(String [] args)
	{
		Abstraction_SBI_Bank a = new Abstraction_SBI_Bank (); //Single level Inheritance 
		a.currentaccount();
		a.savingaccount();
		a.jointaccount();
		a.moneyMarketaccount();
		a.fdaccount();
		
		Abstraction_Bank r = new Abstraction_SBI_Bank(); // Upcasting Abstraction
		r.savingaccount();
		r.currentaccount();
		r.jointaccount();
		r.moneyMarketaccount();
	}
	
	 void jointaccount()
	{
		System.out.println ("I Want To Open Joint Account");
	}

	void moneyMarketaccount()
	{
		System.out.println ("I Want To Open Money Market Account");
	}
	
	
	
	

}
