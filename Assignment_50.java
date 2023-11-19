package Assignments;

class Grandpa
{
	void main0()
	{
		System.out.println("Grandpa");
	}
}
class pappa extends Grandpa
{
	void main1()
	{
		System.out.println("pappa");
	}
}
public class Assignment_50 extends pappa
{
	void main2()
	{
		System.out.println("Child");
	}
	public static void main(String[] args) 
	{
		
      Grandpa abc = new Assignment_50();

        abc.main0();
((pappa) abc).main1();//Explicitly
((Assignment_50) abc).main2();//Explicitly
	}

}
