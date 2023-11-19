 package Java;


public class Swapping {

	int a; int b; int c;
	void add()
	{
		int a=40, b=20, c=1;  
		a=b;
		b=a;
		this.c=a;
		c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {

		Swapping a123 = new Swapping();
		a123.add();
		System.out.println(a123.c);
		
		
		}

}
