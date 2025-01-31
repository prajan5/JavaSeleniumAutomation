package arraysPractice;

public class LengthOfIntegerInArray {
	
	public int countNum(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count = count+1;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {8,13,4,567,7,8904};
		
		LengthOfIntegerInArray len =new LengthOfIntegerInArray();
		for (int i=0;i<=arr.length-1;i++)
		{
		int count = len.countNum(arr[i]);
		System.out.println("The length of the number "+arr[i]+" is " +count);
	     }

}}
