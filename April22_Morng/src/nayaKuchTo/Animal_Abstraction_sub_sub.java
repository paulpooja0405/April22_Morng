package nayaKuchTo;

public class Animal_Abstraction_sub_sub extends Animal_Abstraction{
	
	public static void main (String [] args)
	{
		Animal_Abstraction_sub_sub f = new Animal_Abstraction_sub_sub();
		f.eat();
		f.run();
		f.makingSound();
		f.shape();
		f.survive();
		
		Animal_Abstraction r = new Animal_Abstraction_sub_sub();  //upcasting abstract class
		r.makingSound();
		r.run();
		r.eat();
		r.survive();
		r.shape();
	
		
		
	}
	void makingSound() {
		System.out.println("Bhow Bhow");
	}

	void shape() {
		System.out.println("Dog ka sheput wakada");
	}

	void survive() {
		System.out.println("kuch bhi");
	}

}
