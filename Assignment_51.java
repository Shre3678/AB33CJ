package Assignments;

class Grandpa1
		{
			void main0()
			{
				System.out.println("Grandpa");
			}
		}
		class pappa1 extends Grandpa1
		{
			void main1()
			{
				System.out.println("pappa");
			}
		}
		public class Assignment_51 extends pappa1
		{
			void main2()
			{
				System.out.println("Child");
			}
			public static void main(String[] args) 
			{
				
		      pappa1 abc = new Assignment_51();//upcasting case2
		    //abc.main0();
		      //abc.main1();
		      Assignment_51 c= (Assignment_51) abc;//down casting case 2
		      c.main0();
		      c.main1();
		      c.main2();
		      Grandpa1 abcd = new pappa1();//upcasting case 1
		      abcd.main0();
		     // pappa1 cc = (pappa1) abcd;//down casting case3 
		      //abc.main0();
		      //cc.main1();
		      
	}

}
