package stringPractice;

import java.util.Arrays;

public class TwoStringsAnagram {
	
	public static boolean checkAnagram(String str1, String str2)
	{
		if (str1.length()!=str2.length())
		{
			return false;
		}
		
		char[] charr1 = str1.toCharArray();
		char charr2[] = str2.toCharArray();
		Arrays.sort(charr1);
		Arrays.sort(charr2);
		
		return Arrays.equals(charr1, charr2);
	
		
	}

	public static void main(String[] args) {
	String str1 = "EARTH";
	String str2 = "HEART";
	
	boolean anagram = checkAnagram(str1,str2);
	if(anagram)
	{
		System.out.println("Anagram");
	
	}
	else
	{
		System.out.println("NotAnagram");
	}

}}
