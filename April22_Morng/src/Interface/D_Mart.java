package Interface;

public class D_Mart implements Interface, Interface_1, Interface_2 {


	public void cream() {
		System.out.println("All creams are available");
	}

	@Override
	public void soap() {
		System.out.println("All soap are available");
		
	}

	@Override
	public void sugar() {
		System.out.println("suger free tea");
		
	}

	@Override
	public void tea() {
		System.out.println("Grean Tea");
		
	}

}
