package Java;

public class TypeCasting_Primitives 
{
	static void InttoDobule_widening()
	{
		int a= 10;
		double b= a;            //Implicitly
		double bb =(double) a; // Expilicitly
		//double bb =(double) b; or double bb =(double) 10;
		System.out.println(b);
		System.out.println(bb);
	}
	static	void LongtoInt_Narrowing()
	{
		long c= 1000000000;
		int aa= (int) c;//Explicitly
		
		System.out.println(aa);//Narrowing
	}
	
	public static void main(String[] args) 
	{
		
		InttoDobule_widening();
		LongtoInt_Narrowing();
	}

}
