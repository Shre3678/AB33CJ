package Java;


class Explicit1
{
	Explicit1(int a, int b)
	{
		System.out.println("Explicit1 parameterized");
	}
}
class Explicit2 extends Explicit1
{
	Explicit2()
	{
		super(5,6);
		System.out.println("Explicit2 non parameterized");
	}
}

class Explicit_Super extends Explicit2
{
	Explicit_Super()
	{
		super();
		System.out.println("Explicit_Super non parameterized");
	}

public static void main(String[] args) 
{
	new Explicit_Super();
}	
	
}
