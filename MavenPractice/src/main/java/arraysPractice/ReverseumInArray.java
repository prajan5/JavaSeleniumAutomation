package arraysPractice;

import java.util.Arrays;

public class ReverseumInArray {

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,8};
		
		
		//Method1
		/*for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		
			int size = arr.length;
			int temp[] = new int[size];
		//Method2
		int index = 0;
		for(int i=size-1;i>=0;i--)
		{
			temp[i]= arr[index];
			//index = index+1;
			index++;
			
		}
		
		System.out.println(Arrays.toString(temp));//[8, 7, 6, 5, 4]

		//Method3 print temp using for loop
		for(int i=0;i<=temp.length-1;i++)//8 7 6 5 4 
		{
			System.out.print(temp[i]+" ");
		}
		
	}

}
