package Java;

public class ArrayTable {
static int i, j,k;
	public static void main(String[] args) {
		
		String Name[]= new String[4];
           Name[0]= "Ram";
           Name[1]= "Vishnu";
           Name[2]="Bhim";
          int Age[]= new int[3];
          Age[0] = 51;
          Age[1]= 93;
          Age[2]=11;
	      double Salary[] = new double[3];
	      Salary[0]= 143.25;
	      Salary[1]= 265.63;
	      Salary[2]=11.70;
	      
	     // System.out.println("Name  Age  Salary");
	      for(i=0;i<=2;i++)
	      {
	    	System.out.println(Name[i]+"    "+Age[i]+"   "+Salary[i]);
	    	//  System.out.println(Name[i]);
	      }
	      for(j=0;j<=2;j++)
	      {
	    	  System.out.println(Age[j]);
	      }
	      for(k=0;k<=2;k++)
	      {
	    	  System.out.println(Salary[k]);
	      }
	
	}
	

}
