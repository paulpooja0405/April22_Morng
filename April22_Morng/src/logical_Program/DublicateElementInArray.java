package logical_Program;

public class DublicateElementInArray {
	
	public static void main (String []args)
	
	{
		String a[]= {"java","c","c++","java","c"};
		
		boolean flag =false;
		for (int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found Duplicate Element = "+a[i]);
					flag=true;
				}	
			}
		}
			if (flag==false)
			{
				System.out.println("Duplicate Element Not Found");
			}
		}
		
	}


