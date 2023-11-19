package Java;

public class StaticNonStaticContructor_Oveloading_Con
{
	
	void NS_tatic(int a)
	{
System.out.println("This is Non Static");		
	}
	static void S_tatic(int a, int b)
	{
		System.out.println("This is static");
	}
	StaticNonStaticContructor_Oveloading_Con(float a, float b)
	{
		super();
		System.out.println("this is Constructor value as,  "  +(a+b));
	}
	StaticNonStaticContructor_Oveloading_Con(float a)
	{
		System.out.println("this is Constructor value as");
	}
	public static void main(String[] args) {
		System.out.println("Start");	
	StaticNonStaticContructor_Oveloading_Con abc = new StaticNonStaticContructor_Oveloading_Con(5.6f, 7.8f);
	abc.NS_tatic(7);
	S_tatic(5,9);
	System.out.println("Completed");
	}
	
}
