package Java;

import java.util.Scanner;

public class Concept_StaticMethod_Scanner {

	static void add()
	{
		Scanner Z = new Scanner(System.in);
		System.out.println("Enter the number of a");
		int a =Z.nextInt();
		System.out.println("Enter the number of b");
		int b=Z.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	static void mul()
	{
	Scanner Z = new Scanner(System.in);
	System.out.println("Enter the number of a");
	int a =Z.nextInt();
	System.out.println("Enter the number of b");
	int b=Z.nextInt();
	int c=a*b;
	System.out.println(c);
	}
	static void div()
	{
	Scanner Z = new Scanner(System.in);
	System.out.println("Enter the number of a");
	int a =Z.nextInt();
	System.out.println("Enter the number of b");
	int b=Z.nextInt();
	int c=a/b;
	System.out.println(c);
	}
    static void sub()
	{
	Scanner Z = new Scanner(System.in);
	System.out.println("Enter the number of a");
	int a =Z.nextInt();
	System.out.println("Enter the number of b");
	int b=Z.nextInt();
	int c=a-b;
	System.out.println(c);
	}
	public static void main(String[] args) 
	{

add();
mul();
sub();	 
div();
		
    }

}
