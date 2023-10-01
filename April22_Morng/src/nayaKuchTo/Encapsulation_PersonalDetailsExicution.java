package nayaKuchTo;

public class Encapsulation_PersonalDetailsExicution {
	
	public static void main (String[]args)
	 {
		Encapsulation_PersonalDetails a = new Encapsulation_PersonalDetails();
		 a.setname("POOJA SANDESH MORE");
		 String name = a.getname();
		 System.out.println("Name:"+name);
		
		 a.setID(120);
		 int ID = a.getID();
		 System.out.println("ID Number:"+ID);
		 
		 a.setMobileNumber(7020452544l);
		 long MN = a.getMobileNumber();
		 System.out.println("Mobile Number:"+MN);
		 
		 a.setAge(26);
		 int Age = a.getAge();
		 System.out.println("AGE:"+Age);
		 
		 a.setEducation("BE ");
		 String Education =a.getEducation();
		 System.out.println("Education:"+Education);
		 
		 a.setMarital("Married");
		 String Marital = a.getMarital();
		 System.out.println("Marital Status:"+Marital);
		 
	 }

}
