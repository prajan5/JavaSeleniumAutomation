package week1.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibanacci series 
		//0,1,1,2,3,5,8,13,21
		System.out.println("Enter the number to find out the Fibanacci series using while loop");
		//System.out.println();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int firstnum = 0;
		int secondnum = 1;
		int thirdnum = 0;
		int startnum = 1;
		
		while (startnum<=n)
		{
			System.out.print(firstnum+",");//0,1
			thirdnum = firstnum +secondnum;//0+1,1+1,
			firstnum = secondnum;//1,1
			secondnum = thirdnum; //1,2
			startnum++;
			
		}
		
		
		
		

	}

}
