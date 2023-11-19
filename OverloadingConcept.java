package Java;

public class OverloadingConcept {
	
	static void add()
	{
		System.out.println("method 1");
		
	}
	void add(int a, int b)
	{
		System.out.println("method 2");
	}
	static void add (float a, double b)
	{
		System.out.println("method 3");
		
	}
static void add (double c, double d)
{
	System.out.println("method 4 value is "       +(c+d));
}
	public static void main(String[] args) {
		
add();
add(5.6f, 6.8d);// Static methods
add(4.9, 5.1);
OverloadingConcept abc = new OverloadingConcept(); // Non Static methods  
abc.add(3,8);

	}

}
