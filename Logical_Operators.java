package Java;

public class Logical_Operators {

	public static void main(String[] args) {
		int a=100, b=200;

		//if(a>b||a==b)
		if(!(a<b&&b>a))
		{
			System.out.println("1");
		}
         /*if(a!=b&&a<b)
        	 if(!(a!=b&&a<b))
         {
        	 System.out.println("2");
         }*/
         else
         {
        	 System.out.println("not sati'd");
         }
	}

}
