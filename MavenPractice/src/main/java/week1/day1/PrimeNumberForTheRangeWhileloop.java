package week1.day1;

import java.util.Scanner;

public class PrimeNumberForTheRangeWhileloop {

	public static void main(String[] args) {
		System.out.println("enter the range to find out the prime numbers");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int e = sc1.nextInt();
		
		boolean b;
		
		while(s<e)
		{
			
				
			b = true;
			for (int j=2;j<s;j++)
			{
				if(s%j==0)
				{
					b = false;
					break;
				}
								
			}
			
			if (b==true && s!=0 && s!=1)
			{
				System.out.println(s);
			}
			
			++s;
		}
		
		
	}

}
