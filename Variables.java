package Java;

public class Variables 
{
static boolean c;
static float b;
static int a;
static String doc="kjk";
	static void add()
 {
	 int a=200;
	 System.out.println(a);
	 
 }
	void abc()
	{
		int a=200;
		System.out.println(a);
	}
 
	public static void main(String[] args) {
	add();	
	System.out.println(c);
	Variables c= new Variables();
	c.abc();
	}

}
