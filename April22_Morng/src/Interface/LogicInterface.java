package Interface;

public interface LogicInterface {
	
	
	  void reverseNumber(); // incomplete method
	  
	  default void logic()//complete method
	  {
		  System.out.println("Perform Logical Program");
		  welcome();
	  }
	  
	  private void welcome ()
	  {
		  System.out.println ("we use this is in default");
	  }
	  
	  public static void reverse()
	  {
		  System.out.println("printing reverse numbers");
	  }
	}

