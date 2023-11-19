package Java;

public class This_calling{



	This_calling()
	{
		System.out.println("parameterized");
	}
	
	This_calling(int a, int b)
	{
		this();
		System.out.println("this is non parameterized");
	}

	public static void main(String[] args) {
		new This_calling(5,6);

	}

}
