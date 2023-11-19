package Java;

public class Final_Variable {
	static final int a=10;
	void fin()
	{
        int a=12;
		System.out.println(a);
	}
	Final_Variable(int a, String b, float c)
	{
		System.out.println("Emp code is " +a);
		System.out.println("Emp name is " +b);
		System.out.println("Emp salary is " +c);
	}
	public static void main(String[] args) {
		int b;
		//a=20;
		b=200;
		
		System.out.println(a);
		System.out.println(b);
		Final_Variable Fi = new Final_Variable(1, "sri",34.9999090f);
		Fi.fin();
		
	}

}
