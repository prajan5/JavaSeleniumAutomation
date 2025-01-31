package arraysPractice;

import java.util.Arrays;

public class ReverseumInArrayWhileLoop {

	public static void main(String[] args) {
		int arr[] = {4,5,6,3,7,8};
		
		
		
			int size = arr.length;
			int temp;
		
		int start = 0;
		int end =size-1;
		while(start<=end)
		{
		
			temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		
			
			start++;
			end--;
			
			
		}
		
		System.out.println(Arrays.toString(arr));//[8, 7, 6, 5, 4]

		

}
}