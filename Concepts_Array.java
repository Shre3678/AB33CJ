package Java;

public class Concepts_Array {

	public static void main(String[] args) {
		
       int StudentID[]= new int[3];
       StudentID[0]= 123;
       StudentID[1]=456;
       StudentID[2]=789;
       String Studentname[] = new String[3];
       Studentname[0]= "Shree";
       Studentname[1]="Honey";
       Studentname[2]="SH";
       String SubName[]= new String[3];
       SubName[0]="CS";
       SubName[1]="SS";
       SubName[2]="M2";
       double StudentFee[]= new double[3];
       StudentFee[0] = 500000;
       StudentFee[1] = 60000.0;
       StudentFee[2] = 700000; 
		for (int i=0;i<=2;i--) 
       {
    	   System.out.println(Studentname[i]+ " " +StudentID[i]+ " " +StudentFee[i]);   
       }
		/*for (int j=0;j<=2;j++) 
	       {
	    	   System.out.println(StudentID[j]);   
	       }
		for (int k=0;k<=2;k++) 
	       {
	    	   System.out.println(SubName[k]);   
	       }
		for (int l=0; l<=2; l++)
		{
			System.out.println(StudentFee[l]);
		}*/
       
		
	}

}
