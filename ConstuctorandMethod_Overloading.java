package Java;

public class ConstuctorandMethod_Overloading 
{
	ConstuctorandMethod_Overloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
    void M_ethod(int a, float b)
    {
    	System.out.println(a+b);
    }
	public static void main(String[] args) 
	{
		//new ConstuctorandMethod_Overloading(5,7);
		ConstuctorandMethod_Overloading c = new ConstuctorandMethod_Overloading(5,7);
		c.M_ethod(1, 4f);
		System.out.println("constructor overloading and method overloading possible");
		
	}  
		

}
