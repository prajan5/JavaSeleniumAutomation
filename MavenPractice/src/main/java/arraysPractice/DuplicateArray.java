package arraysPractice;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[]duparray = {20,40,5,25,20,45,10,80,60,25,80};
		//Method1
		System.out.println("Duplicate numbers in the array are:");
		for (int i = 0;i<duparray.length;i++ )
		{
			
			for (int j=i+1;j<duparray.length;j++)
			{
				if (duparray[i]==duparray[j])
					
				{
					System.out.print(duparray[i]+",");
				}
			}
		}
		
		System.out.println();
		//Method2
		Arrays.sort(duparray);
		System.out.println(Arrays.toString(duparray));
		//[5, 10, 20, 20, 25, 25, 40, 45, 60, 80, 80]
		System.out.println("Duplicate numbers in the array using single loop:");
		for (int k = 0;k<duparray.length-1;k++ )
		{
			if (duparray[k]==duparray[k+1])
					{
				System.out.print(duparray[k+1]+",");
					}
		}
		
	
	}

}
