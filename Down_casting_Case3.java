package Java;

//case 3
class down4
{
	void Grand_parent0()
	{
		System.out.println("Down1");
	}
}
class down5 extends down4
{
	void Grand_parent1()
	{
		System.out.println("Down2");
	}
}

public class Down_casting_Case3 extends down5
{
	void Grand_parent2()
	{
		System.out.println("Down3");
	}

	public static void main(String[] args) 
	{
	
		down5 xx = new Down_casting_Case3();
		down5 x = (down5) xx; 
		down5 xxx= (down5) xx;
		xxx.Grand_parent0();
		xxx.Grand_parent1();
		x.Grand_parent0();
    }

}
