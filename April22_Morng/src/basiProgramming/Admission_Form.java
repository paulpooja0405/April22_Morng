package basiProgramming;

public class Admission_Form {
	// declare
	String Name;
	long BirthDate;
	String Gender;
	String Mail;
	String Education;
	//initialization
	Admission_Form(String a,long b,String c, String d, String e){
		
		Name = a;
	    BirthDate = b;
	    Gender = c;
		Mail = d;		
		Education = e;		
	}
	//usase
	public void A1() {
		System.out.println("Name:"+ Name);
		System.out.println("BirthDate:"+ BirthDate);
		System.out.println("Gender:"+ Gender );
		System.out.println("Mail:"+ Mail);
		System.out.println("Education:"+ Education);
	}
	
	public static void main ( String [] args ){
	
	
		
		Admission_Form poonam = new Admission_Form("Pooja",2102000,"Female","abc@gmail.com","BE");
		
		poonam.A1();
	

}
}