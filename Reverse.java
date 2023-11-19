package Java;

public class Reverse 
{

	
public static void main(String[] args) 
			  {
   String originalStr = "I'm Srinivas Bandari";
   String reversedStr = "";
    System.out.println("Original string: " + originalStr);
			        
			    for (int i = 0; i < originalStr.length(); i++) 
			    {
			      reversedStr = originalStr.charAt(i) + reversedStr;
			    }
			    
			    System.out.println("Reversed string: "+ reversedStr);
			  
	}

}
