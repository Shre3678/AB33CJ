package Java;

public class Contructor_Concept {

	public static void main(String[] args) {
	
		//Contructor_Concept a = new Contructor_Concept();
		new Contructor_Concept(10,5.7f);
		new Contructor_Concept(10,5);
	}
	
	Contructor_Concept(int a, int b)	
	
	{  
		System.out.println("values is,  "  +(a+b));
	}
Contructor_Concept(int a, float b)	
	
	{
	//this(5, 6);
		System.out.println("values is,  "  +(a+b));
	
	}

}
