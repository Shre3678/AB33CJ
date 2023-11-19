package Java;


class Grand_Parent121
{
	void Up_casting1()
	{
	System.out.println("Upcasting");
    }
}

class Parent121 extends Grand_Parent121
{
	void Up_casting2()
	{
	System.out.println("Upcasting");
    }
}

public class TypeCasting_2class_child extends Parent121{
	
	
	void abc()
	{
	System.out.println("Upcasting");
    }


	public static void main(String[] args) 
	{
		Grand_Parent121 abcd = new TypeCasting_2class_child();
		((Grand_Parent121) abcd).Up_casting1();// or abcd.Up_casting1(); we can go with two ways i.e., Imp nd Exp
		((Parent121) abcd).Up_casting2();//Im
		((TypeCasting_2class_child) abcd).abc();//Ex

	}

}
