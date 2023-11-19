package Java;

import java.util.Scanner;

public class StaticMethod4_InsideMM_Scannerclass {
	
	static int a,b;
	//static float c;
	

	public static void main(String[] args) 
	{
		//StaticMethod4_InsideMM S= new StaticMethod4_InsideMM();
		
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the values");
	   	a = abc.nextInt(); 
		b = abc.nextInt();
		//c= abc.nextFloat();
		add();
		sub();
		mul();
		div();
			}
		static void add()
		{
			System.out.println(a+b);
		}
		static void sub()
		{
			System.out.println(a-b);
		}
		static  void mul()
		{
			System.out.println(a*b);
		}
		static void div()
		{
			System.out.println(a/b);
		}
}
