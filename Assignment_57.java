package Assignments;

public class Assignment_57 {

	public static void main(String[] args) 
	{

		try 
		{
			int a=1/0;	
			System.out.println(a);
		}
	catch(ArithmeticException a)
	{
	System.out.println("Exception occured");	
    }
		finally
		{
			System.out.println("this is block always excuted");
		}

	}
	}

