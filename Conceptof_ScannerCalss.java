package Java;

import java.util.Scanner;

public class Conceptof_ScannerCalss 
{
	static int c,z;
	public static void main(String[] args) 
	{
		
		Scanner abc= new Scanner(System.in);
		System.out.println("Enter the values of a, b");
	    int a = abc.nextInt();
		int b = abc.nextInt();
		double e =abc.nextDouble();
		double d =abc.nextDouble();
		System.out.println("The addition value of c");
        System.out.println(c=a+b);
        System.out.println("The mul value of z");
        System.out.println(z=a*b);       
        System.out.println("The sub value of e,d");
        System.out.println(e-d);
        abc.close();

	}

}
