package stringPractice;

public class PalindromeStringCharArray {

	public static void main(String[] args) {

		String orignal = "MADAM";
		String reverse = "";
		
		char [] ch = orignal.toCharArray();
		
		for (int i=ch.length-1;i>=0;i--)
		{
			reverse = reverse+ch[i];
		}
		
		
		System.out.println(reverse);
		if (orignal.equalsIgnoreCase(reverse))
		 {
			System.out.println("Palindrome");
						
		 }
		else
		{
			System.out.println("it is not Palindrome");
			
		}
			 			
		
		
	}
}

