package stringPractice;

import java.util.Scanner;

public class PalindromeStringWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int leftch = 0;
		int rightch = str.length()-1;
		boolean b;
		
		b = true;
		while(leftch<rightch)
		{
			if(str.charAt(leftch)!=str.charAt(rightch))
			{
			b=false;
						}
		
		leftch ++;
		rightch --;
		}
				
		if(b==true)
		{
			System.out.println(str + " is a palindrome.");
		}
		else
		{
			System.out.println(str + " is not a palindrome.");
		}
			

	}

}
