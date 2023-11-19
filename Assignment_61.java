package Assignments;

public class Assignment_61 
{

	public static void main(String[] args) 
	{
		String s="MY NAME IS MKT";
		 String word[]=s.split("\\s");
		String result="";
		
		for(String str:word)
		{
			
			
			String firstletter=str.substring(0, 1).toUpperCase();
			String restString=str.substring(1).toLowerCase();
			result=result+firstletter+restString+" ";
			
			
		}
		
		System.out.println(result);

	}

}
