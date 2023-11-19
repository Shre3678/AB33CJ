package Java;

public class Call__Multiple_non_static_method {

	void Non_Static1()
	{
		System.out.println("Its Non Static 1");
	}
	void Non_Static2()
	{
		System.out.println("Its Non Static 2");
	}
	void Non_Static3()
	{
		System.out.println("Its Non Static 3");
	}
	void Non_Static4()
	{
		System.out.println("Its Non Static 4");
	}
	
	public static void main(String[] args) {

		Call__Multiple_non_static_method abc=new Call__Multiple_non_static_method();
		abc.Non_Static1();
		abc.Non_Static2();
		abc.Non_Static3();
		abc.Non_Static4();
	}

}
