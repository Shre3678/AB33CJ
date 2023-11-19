package Java;



class A1
{
A1()
{
	System.out.println("Form Parent");
}
}
class Implicit_super extends A1{
	Implicit_super ()
	{
		//super(); this one is present here Implicitly
		System.out.println("From child");
	}

	public static void main(String[] args) {
		
		new Implicit_super(); 
	}
}
