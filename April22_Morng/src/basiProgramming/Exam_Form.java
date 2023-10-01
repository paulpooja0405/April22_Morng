package basiProgramming;

public class Exam_Form {
	
	String Name;
	long BirthDate;
	String Gender;
	String Semester;
	String Education;
	
	Exam_Form(String a,long b,String c, String d, String e){
		
		Name = a;
	    BirthDate = b;
	    Gender = c;
		Semester = d;		
		Education = e;		
	}
	public void A1() {
		System.out.println("Name:"+ Name);
		System.out.println("BirthDate:"+ BirthDate);
		System.out.println("Gender:"+ Gender);
		System.out.println("Semester:"+ Semester);
		System.out.println("Education:"+ Education);
	}
	
	public static void main ( String [] args ){
	
	
		
		Exam_Form poonam = new Exam_Form("Pooja",101999,"Female","Second","BE");
		
		poonam.A1();
	

}
}


