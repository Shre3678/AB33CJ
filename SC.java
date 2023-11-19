package Java;

import java.util.Scanner;

public class SC {

	public static void main(String[] args) {

		Scanner abc=new Scanner(System.in);
		System.out.println("Enter anything");
		String Myname = abc.next();
		System.out.println("Enter a Value");
		int a = abc.nextInt();
		System.out.println("Enter b Value");
		double b = abc.nextDouble();
		System.out.println("Enter c Value");
		double c =a+b;
		System.out.println(c);

	}

}
