package Java;

public class Nest {
	static int a = 200;
	static int b = 200;
	static int c = 300;

	    public static void main(String[] args) {
	 
	       
	 
	        if (a == b) 
	        {
	 
	            // nested if else condition
	            if (!(a < c || a==c)) 
	            {
	                // all are equal
	                System.out.println("Equal");
	            } else 
	            {
	                
	                System.out.println("Not equal");
	            }
	        } 
	        else 
	        {
	            
	            System.out.println("Not equal");
	        }
	    }
	    
}
	    