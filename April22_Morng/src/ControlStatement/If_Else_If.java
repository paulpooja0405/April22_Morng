package ControlStatement;

public class If_Else_If {
	
	int a = 200000;
	
	public void a1()
	{
		if (a<=500000){
	      
			System.out.println("no tax");
	      }
			else if (a>500000 && a<750000)
			{
				System.out.println("5 percent");
			}
			else if (a>750000)
			{
				System.out.println("10 percent");
			}
		}
	      public static void main (String [] args)
	      {
	    	  If_Else_If s = new If_Else_If();
	    	  s.a1();
	      }
	}
	
	
	


