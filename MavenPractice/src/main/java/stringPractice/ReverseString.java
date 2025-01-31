package stringPractice;

public class ReverseString {

	public static void main(String[] args) {
		String str1  = "Priya Rajan";;
		//converting string to charArray
		System.out.println("**********toCharArray*********");
		
		char ch[] = str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			
		}
		
		System.out.println();
		
		System.out.println("**********charAt*********");
		for(int j=str1.length()-1;j>=0;j--)
		{
			System.out.print(str1.charAt(j));
		}

	}

}
