package Java;


class abc{
	//static void abc()
	void AA(int a, int b)
	{
		System.out.println("This is non Static");
	System.out.println(a+b);	
	}
}

public class Inheritance_Concepts_Single_In extends StaticMethod4_InsideMM_Scannerclass {

	static void def()
	{
		System.out.println("b");
	}
	
	
	public static void main(String[] args) {
		
		Inheritance_Concepts_Single_In A = new Inheritance_Concepts_Single_In();
		//A.AA(3,5);
		A.sub();
		
	//abc();
	def();
	}

}
