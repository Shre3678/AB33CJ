package Java;

public class ExampleofGL {
	static int a, b,c;	
	String name="Shree";
	boolean x;
	static String global;
	void add()
		{
			final int a =10;
			b=20;
			int c= a+b;
			if(c!=30)
			{
			System.out.println(name);
			}
			else
			{
				System.out.println(x);
			}
		//	System.out.println(a+b);
		}
		
		//	System.out.println(a-b);
			static void mul()
			{
			    a=50;
				b=60;
				int c= a*b;
				System.out.println(c);
			}		//	System.out.println(a*b);
				static void div()
				{
					int a;
					a=50;
					int b=2;
					int c= a/b;
					System.out.println(c);
				}
				//	System.out.println(a/b);
		public static void main(String[] args) {
			System.out.println("The values are  ");
			
a=1;
c=a*2;
b=c;
if(a!=c)
{
System.out.println(global);
}
			ExampleofGL SS = new ExampleofGL();
	SS.add();
	//mul();
	//div();

		}

	}


