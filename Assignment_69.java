package Assignments;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Assignment_69 {

	@Test
	public void Swi()
	{
		
		switch(1)
		{
		case 1:
			Scanner In = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = In.nextInt();
			System.out.println("Enter b value");
			int b= In.nextInt();
			int c=a+b;
			System.out.println("The c value is  "+ c);
		default:
			System.out.println("d");
		}

	}

}
