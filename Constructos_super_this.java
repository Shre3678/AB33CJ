package Java;

class SuperGP
{
	SuperGP()
	{
		System.out.println("Form GP");
	}
	SuperGP(double a)
	{
		this();// calling the SuperGP()
		System.out.println("Form GP0");
	}
	SuperGP(double a, int c)
	{
		this(4.5); 	// calling SuperGP(double a)
		System.out.println("Form GP1");
	}
}
class SuperP extends SuperGP
    {
	SuperP()
	{
        super(5.6, 6);// calling SuperGP(double a, int c)
		System.out.println("from p");
	}
	}
public class Constructos_super_this extends SuperP{
	Constructos_super_this()
	{

		//present here super calling statement SuperP() in implicitly
		System.out.println("child");
	}
	public static void main(String[] args) 
	{
	new Constructos_super_this ();
	}
}
