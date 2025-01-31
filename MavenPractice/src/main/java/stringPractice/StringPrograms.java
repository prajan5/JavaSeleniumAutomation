package stringPractice;

public class StringPrograms {

	public static void main(String[] args) {
		String s = "Welcome to Our Company";
		int ilength = s.length();
		System.out.println("string Length: "+ilength);
		
		
		//String literal;
		String s1 = "Welcome";
		//String instantiation 
		String s2 = new String("Welcome");
		
		System.out.println("********==*********");
		//== operator checks the memory address
		
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");//Not equal
		}
		
		System.out.println("****equals()*********");
		//.equals checks the value\content
		
		if(s1.equals(s2))
		{
			System.out.println("equal");//equal
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		        //String literal;
				String s3 = "Welcome";
				//String instantiation 
				String s4 = new String("welcome");
				
		
		System.out.println("****equalsIgnoreCase(string)*********");
		
		
		if(s3.equalsIgnoreCase(s4))
		{
			System.out.println("equal");//equal
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		
		
		System.out.println("****contains(string)*********");
		String a = "Selenium";
		boolean b = a.contains("Se");
		System.out.println(b);
		
		System.out.println("****charAt(index)*********");
		
		char c = a.charAt(5);
		System.out.println(c);
		
		System.out.println("****tocharArray*********");
		
		String str1  = "WebDriver";
		//converting string to charArray. directly cannot iterate string
		
		char ch[] = str1.toCharArray();
		
	
		
		//for(int i=0;i<str1.length();i++) {
			//System.out.print(str1(i));

		System.out.println("*****iterate string coverting to toCharrArray()");
		for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]);
		}
		
		System.out.println();
		System.out.println("*****iterate string with ******CharAt(index)*****");
		
		for(int j=0;j<ch.length;j++) {
			System.out.print(str1.charAt(j));
			}
		System.out.println();
		
		System.out.println("*****Convertign char to String** toString()*****");
		 char ch1 = 'A';

		 String str = Character.toString(ch1);

		 System.out.println("\n"+"Char to String: "+ str);

	

	

	}

}
