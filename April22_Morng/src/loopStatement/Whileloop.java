package loopStatement;

public class Whileloop {
	// Standard Syntax
	//while(Condition){Statement}
	//print 1 to 10 numbers
	int a = 1;
	public void a1()
	{
	while(a<=10)
	{
	System.out.println(a);
	a++;
	}
	}
	public static void main(String[]args)
	{
	Whileloop s = new Whileloop();
	s.a1();
	}

}
