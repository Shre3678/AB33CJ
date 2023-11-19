package Assignments;

public class Assignment_58 {

	public static void main(String[] args) {
		String a= " I'm Perfect";
		String s= "I'm Perfect";
		
		int b= a.length();
		System.out.println(b);
		
		char c= a.charAt(1);
		System.out.println(c);

		int index = a.indexOf("e");
		System.out.println(index);
		
		System.out.println(a.substring(4));
		
		System.out.println(a.substring(3, 7));
		
		System.out.println(a.trim());
		
		String d = "";
		boolean e=d.isEmpty();
		System.out.println(e);
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.contains("a"));
		System.out.println(a.matches(s));
		System.out.println(a.equals(s));
		System.out.println(a.concat(" ").concat(s));	
		System.out.println(a.lastIndexOf('e'));
	}

}
