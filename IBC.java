package Java;

interface In
{
	void UserName();
}

abstract class Ab implements In
{
	abstract void UserId();
}

abstract class Cl extends Ab
{
	static void login()
	{
		System.out.println("From Cl");
	}
}

public class IBC extends Cl{

	public static void main(String[] args) {

		IBC a = new IBC();
		a.UserName();
		a.UserId();
		login();
	}
    public void UserName() 
	{
	System.out.println("From Interface");
	String name ="Shree";
	System.out.println(name);
		}
	void UserId() 
	{
		System.out.println("From Abstract");
		int a= 12345;
		System.out.println(a);
	}

}
