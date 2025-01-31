package stringPractice;

public class PalindromeCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orignal = "Priya";
		String reverse = "";
	
	     int len = orignal.length();
		
		for (int i=len-1;i>=0;i--)
		{
			reverse = reverse+orignal.charAt(i);
		}
		
		
		//System.out.println(reverse);
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
