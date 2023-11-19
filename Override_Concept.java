package Java;

import java.util.Scanner;
class b
{

static int a, b, c;
	void add()
	{
		System.out.println(a);
	}

}
public class Override_Concept extends b 
{
	void add()
	{
		int d=10;
		if(d==10)
		{
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the values");
		a= abc.nextInt();	
		b= abc.nextInt();
		System.out.println(a+b);
		super.add();
		}
	
	}
	public static void main(String[] args) 
	{
		Override_Concept ac = new Override_Concept();
		ac.add();
		ac.add();
	}

    
}
