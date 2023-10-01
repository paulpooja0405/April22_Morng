package loopStatement;

public class Do_whileloop {
	
	int i = 1;
	public void a1()
	{
	do
	{
	System.out.println(i);
	i++;
	}while(i<=10);
	}
	public static void main(String[]args)
	{
		Do_whileloop s = new Do_whileloop();
	s.a1();
	}

}
