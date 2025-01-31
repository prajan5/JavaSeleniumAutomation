package arraysPractice;

public class AverageOfNumbersInArray {

	public static void main(String[] args) {
		int arr[] = {10,30,40,50,60};
		int sum = 0;
		
		for (int num : arr)
		{
			sum = sum+num;
		}

		double average = sum/arr.length;
		System.out.println(average);
	}

}
