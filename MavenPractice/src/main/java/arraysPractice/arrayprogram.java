package arraysPractice;

import java.util.Arrays;

public class arrayprogram {

	public static void main(String[] args) {
	
		//literal
		int[]scores = {20,40,10,80,60};
		String[]coaches = {"Samuvel","Reena","Britto"};
		//Instantiation
		int marks[] = new int[5];
		String[] name = new String[3];
		
		//find the length of the array.
		int length = scores.length;
		System.out.println(length);//5
		//last value of array
		System.out.println(scores[length-1]);//60
		//sort
		Arrays.sort(scores);
		
		System.out.println(scores[length-1]);//80
		
	for (int i = 0;i<scores.length;i++) {
		System.out.print(scores[i]+",");
	}
	
	System.out.println("reverse Order");
	
		//For reverse order index should be length -1
		for (int j = scores.length-1;j>=0;j--) {
			System.out.print(scores[j]+",");
			
			
			
	}
		

	}
}


