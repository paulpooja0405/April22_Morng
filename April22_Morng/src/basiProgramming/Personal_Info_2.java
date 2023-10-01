package basiProgramming;

public class Personal_Info_2 {
	
	String Name;
	String School_name;
	char Div;
	byte Age;
	
	Personal_Info_2 (){
		
		Name = "Ram kore";
		School_name = "NSB Highschool";
		Div = 'A';
		Age = 26;
	}
	
	public void Ronak () {
		
		System.out.println ("Name =" + Name);
		System.out.println ("School_name =" + School_name);
		System.out.println ("Div =" + Div);
		System.out.println ("Age =" + Age);
		
	}
	
	 public static void main(String [] args) {
		 
		 Personal_Info_2 k = new Personal_Info_2();
		 k.Ronak();
		 
		 
	 }

}
