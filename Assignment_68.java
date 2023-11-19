package Assignments;

public class Assignment_68 {

	public static void main(String[] args) throws InterruptedException {
int a=1;

if(a<0)
{
System.out.println(a);
}
else
{
	Thread.sleep(4000);
	throw new ArithmeticException ("Hello");
}


}
}