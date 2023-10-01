package nayaKuchTo;

public class Compiletime_Polymorphism {
	
	public void tea(int a) // method name should same
	                       // with differant argument
	{
		System.out.println ("Yevle Tea");
	}
	
	public void tea(int a, int b)// static / early binding
	{
		System.out.println ("Amruttulya Tea");
	}
	
	public static void main (String [] args) {
	
	Compiletime_Polymorphism a = new Compiletime_Polymorphism();
	a.tea(2);      // method overloading
	a.tea(5,6);

}
}
