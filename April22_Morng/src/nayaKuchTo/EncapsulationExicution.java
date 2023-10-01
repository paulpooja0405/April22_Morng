package nayaKuchTo;

public class EncapsulationExicution {
	
	public class EncapTestExecution {
		public static void main(String[] args) {
			Encapsulation e = new Encapsulation();
			e.setBalance(2000);
			double value = e.getBalance();// 2000
					
			System.out.println("Balance is  = " + value);
			System.out.println(e.getBalance());
		}

	}
}
