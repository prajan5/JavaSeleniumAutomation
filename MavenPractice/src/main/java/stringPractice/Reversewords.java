package stringPractice;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		 String str = " We had a great time ";

		 //Convert string to string array
		 String[] words = str.split(" ");

		 StringBuilder reversed = new StringBuilder();

		 for(i=words.length-1; i>= 0; i--)
		 {

		 reversed.append(words[i]).append(" ");

		 }

		 //System.out.println("Reversed Words:"+ reversed.toString().trim());
		 System.out.println("Reversed Words:"+ reversed);
	}

}
