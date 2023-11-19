package Java;
import java.util.Scanner;
class Grand_Parent
{
	Grand_Parent()
	{
		Scanner a1= new Scanner(System.in);
		System.out.println("Enter a value");
		int a = a1.nextInt();
		System.out.println("Enter a value");
		int b = a1.nextInt();
		int c = a+b;
		System.out.println(c);
		if(c==5) 
		{
			System.out.println("it is a grand parent constructor");	
		}
		}
Grand_Parent(int a)
	{
		this();
		System.out.println("it is a grand parent constructor with 1 parameters");
	}
	}
class Parent extends Grand_Parent
{
	int a;
	int b;
	int c=10;
	Parent()
	{
		this(10);
		System.out.println("it is a parent constructor with no parameters");
	}
	Parent(int a)
	{
		this(10,20);
		System.out.println("it is a parent constructor with 1 parameters");
	}
	Parent(int a, int b)
	{
		super(10);
		if(!(c!=10 || c==10))
		{
		System.out.println("it is a parent constructor with 2 parameters");
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
		}
}
public class Statement_KeywordsExample extends Parent
{
	
	Statement_KeywordsExample()
	{
		System.out.println("it is child constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("I hope this one is good");
		 new Statement_KeywordsExample();
		 }
	}
