package Java;

class Teacher1// case 2
{
	void down0()
	{
		System.out.println("Teacher");
	}
}
class Teacher extends Teacher1// case 1
{
	void down1()
	{
		System.out.println("Teacher");
	}
}
public class DownCasting_Student extends Teacher
{
	void down2()
	{
		System.out.println("Student");
	}

	public static void main(String[] args) 
	{
		
		Teacher z = new DownCasting_Student ();//Up-casting case 1 and 2
	
		DownCasting_Student zz = (DownCasting_Student)z;//Explicitly case 1 and 2
		
		zz.down1();
		zz.down2();
		zz.down0();
	}

}
