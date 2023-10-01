package basiProgramming;

public class Constructor1 {
	String Name ;
	   int age ;
	   int year ;
	    Constructor1 ()
	{
	   Name = "pooja";
	   age = 50;
	    year = 2023;
	   
	    System.out.println ("Name = "+Name +"\n"+ "age ="+ age + "\n"+ "year =" +year);
	}
	   Constructor1 (int year,int age)
	{
	  System.out.println ("Print year ="+year + "\n"+" print here age =" + age);
	}
	public static void main (String [] args)
	{
	  new Constructor1();
	  new Constructor1 (2023,20);

	}
}