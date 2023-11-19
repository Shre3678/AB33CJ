package Java;

public class India {

	public static void main(String[] args) {
	String c= "My Country Is India";
	
	
	for(int i=0;i<c.length();i++)
	{
	try
	{
		for(int j=0;j<=c.length();j++)
		{
System.out.println(c.substring(i)+"  "+c.substring(j));
		}
	}
		catch(java.lang.StringIndexOutOfBoundsException j)
		{
			System.out.println("java.lang.StringIndexOutOfBoundsException");
		}
	
		/*for (int i=0;i>c.length();i++)
		{
System.out.print(c.charAt(i));
	}
	
		{
		System.out.println(c.substring(14, 19)+c.substring(10, 14)+c.substring(3, 11)+c.substring(0, 3));
		}*/
	}
}
	}

