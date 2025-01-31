package stringPractice;

public class NoOfoccurenceCharacters {

	public static void main(String[] args) {
		String str = "Little Lilly";
		char ch = 'l';
		int count = 0;
		
		for (int i = 0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		
		System.out.println("No of occrence of "+ch+" is: "+count);
		
		

	}

}
