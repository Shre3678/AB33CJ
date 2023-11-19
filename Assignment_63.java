package Assignments;

import java.util.Date;

public class Assignment_63 
{

	public static void main(String[] args) 
	{
		
		Date CT = new Date();
		long a=CT.getTime();
		System.out.println(a);
		
		Date CT1= new Date(a+(1000*60*60*24*0));

		System.out.println(CT1);
		
		
	}

}
