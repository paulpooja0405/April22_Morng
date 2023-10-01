package ControlStatement;

public class Nested_If_Else {
	
	//Blood Donation
	//Age>21
	//weight>48
	//HB>10
	byte Age = 44;
	byte weight = 50;
	int HB=6;
	public void a1()
	{
	if(Age>20)
	{
	if(weight>48)
	{
	System.out.println("You are eligible for Donation");
	}
	}
	else
	{
	System.out.println("Not valid for Blood Donation");
	}
	}
	public static void main(String[]args)
	{
		Nested_If_Else p = new Nested_If_Else();
	p.a1();
	}
}	
