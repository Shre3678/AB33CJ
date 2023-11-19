package Java;

interface INterface
{
	void Inter();
	
}

public class I1_CC2 implements INterface{
	static void a()
	{
		System.out.println("CC1");
	}
	static void b()
	{
		System.out.println("CC2");	
	}
	
	public static void main(String[] args) {
		
		I1_CC2 v = new I1_CC2();
		v.Inter();
		a();
		b();
	}
	
	public void Inter() {
	System.out.println("From Interface");
		
	}

}
