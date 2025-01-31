package week1.day1;

import java.util.Scanner;

public class PrimeNumberForTheRange {

	public static void main(String[] args) {
		System.out.println("enter the range to find out the prime numbers");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int e = sc1.nextInt();
		int i;
		boolean b;
		for (i=s;i<=e;i++)
		{
			if (i==1 || i==0)
			{
				continue;
			}
				
			b = true;
			for (int j=2;j<i;++j)
			{
				if(i%j==0)
				{
					b = false;
					break;
				}
				
				
			}
			if (b==true)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
