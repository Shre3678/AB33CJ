package Java;

interface Interf
{
	void AM();
	
}
interface CC{
	void Concrete();
	
}

public class Concept_of_MultiplelelevInheritance implements Interf, CC  {
	
	void aaa()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		
		Concept_of_MultiplelelevInheritance a2 = new Concept_of_MultiplelelevInheritance();
	                         a2.aaa();  
	                         a2.Concrete();
	                         a2.AM();
	                         
	}
	@Override
	public void AM() {
		System.out.println("AM");
	}
	@Override
	public void Concrete() {
		// TODO Auto-generated method stub
		System.out.println("CC");
	}
}
