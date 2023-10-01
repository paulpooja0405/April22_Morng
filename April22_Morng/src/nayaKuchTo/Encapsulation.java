package nayaKuchTo;

public class Encapsulation {
	

	// Pojo class/Encapsulated Class
	private double balance;// 2000 Private

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance >0 ) {
			this.balance=balance;// 2000
		}
	}
 
	// Name, id, mobno, age, education, singleOrMarried
	
	// void - koid roid moid soid poid
	// Return Type - Void only 
	// Return Type - Data Type

	// 1) class = Method(Show) + Variable(NOt Show)
	// class = Method(not Show) + Variable(Show)

	// Encapsulation is process of binding data member and its
	// corresponding method together into single unit

	// How to achieve the Encapsulation
	// Variable - Private - Information - Data Hiding 
	// Method - Public
	// Encapsulation = Data Hiding + Abstraction
	// getters = get
	// setters = set

}
