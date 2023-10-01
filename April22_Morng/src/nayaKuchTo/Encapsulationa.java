package nayaKuchTo;

import java.util.Scanner;

public class Encapsulationa {
	
	private String name;
	private int id;
	private long mobileno;
	private String education;
	private String marital;
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		Scanner s = new Scanner (System.in);
		String name1 = s.nextLine();
		System.out.println("NAME; "+ name1);
		
		this.name = name;
	}
	

}
