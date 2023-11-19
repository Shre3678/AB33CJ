package Java;

class Seed_Grandpa
{
	static void Grandpa0()
	{
		System.out.println("Sree1");
	}
	static void Grandpa1()
	{
		System.out.println("SSree2");
	}
	void Grandpa2()
	{
		System.out.println("Sree3");
	}
	void Grandpa3()
	{
		System.out.println("SSree4");
	}
}
class plant_parent extends Seed_Grandpa
{
      void Parent0()
	{
		System.out.println("Sree5");
	}
      void Parent1()
  	{
  		System.out.println("SSree6");
  	}
    static  void Parent2()
  	{
  		System.out.println("Sree7");
  	}
    static void Parent3()
    	{
    		System.out.println("SSree8");
    	}
}
public class Multilevel_Inheritance_Fruit extends plant_parent 
{
	void Child0()
	{
		System.out.println("Sree9");
	}
    void Child1()
	{
		System.out.println("SSree10");
	}

public static void main(String[] args) 
{
	Multilevel_Inheritance_Fruit SS = new Multilevel_Inheritance_Fruit();
	Grandpa0();
	Grandpa1();
	SS.Grandpa2();
	SS.Grandpa3();
	SS.Parent0();
	SS.Parent1();
	Parent2();
	Parent3();
	SS.Child0();
	SS.Child1();
	}
}

