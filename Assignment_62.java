package Assignments;

import java.util.Date;

public class Assignment_62 
{
public static void main(String[] args) 
{
	Date date = new Date();
	System.out.println(date.getTime());// Epoch time
	
	Date date1 = new Date(date.getTime()); // normal Time Current time
	System.out.println(date1);
	
	Date date2 = new Date(date.getTime()+(1000*60*60*24*5));// Future time  5 days
	System.out.println(date2);

	Date date3 = new Date(date.getTime()-(1000*60*60*24*5));// past time 5 days
	System.out.println(date3);

}
}
