package Java;

abstract class Google
{
	abstract void Zoom(int a, int b);
	abstract void google(double a, double b);
	static void Hello()
	{
		System.out.println("Here I'm");
	}
}
abstract class Concreate_class extends Google
{
	static void Hello1()
	{
		System.out.println("Here I'm");
	}
	void Hello2()
	{
		System.out.println("Here I'm");
	}
	void Hello3()
	{
		System.out.println("Here I'm");
	}
}


public class Conceptof_Abstract extends Concreate_class{
	void Hello4()
	{
		System.out.println("Here I'm");
	}
	static void Hello5()
	{
		System.out.println("Here I'm");
	}
	static void Hello6()
	{
		System.out.println("Here I'm");
	}
	
	public static void main(String[] args) 
	{
		Conceptof_Abstract a = new Conceptof_Abstract();
		Hello();
		Hello1();
		a.Hello2();
		a.Hello3();
		a.Hello4();
		Hello5();
		Hello6();
		a.Zoom(5,6);
		a.google(4.0, 5.6);
	}
	void Zoom(int a, int b) 
	{
		
		int c=a+b;
	System.out.println(c);	
	}
	
	void google(double a, double b) 
	{
		
		System.out.println(a+b);
	}
	
	

}
