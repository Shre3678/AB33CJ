package Java;


abstract class Practice3
{
	abstract void method4 ();
	abstract void method5();
	static void method6() 
	{
		System.out.println("Grand parent class method");
	}
}
abstract class Practice2  extends  Practice3
{
	abstract void method2();
	abstract void method3();
	static void method7() 
	{
	System.out.println("parent class method");
	}
}
class Practice1 extends  Practice2
{
	static void method1() 
	{
		System.out.println("child class method");
	}
		
		

	public static void main(String[] args) 
	{
		System.out.println("All are method");
		Practice1 p1=new Practice1();
		method1();
		method7();
		method6();
		p1.method2();
		p1.method3();
		p1.method4();
		p1.method5();
		
		
		
		

	}



	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("form abstract  m2");
	}



	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println(" form abstract  m3");
	}



	@Override
	void method4() {
		// TODO Auto-generated method stub
		System.out.println("form abstract m4");
	}



	@Override
	void method5() {
		// TODO Auto-generated method stub
		System.out.println("form abstract m5");
	}
	
}