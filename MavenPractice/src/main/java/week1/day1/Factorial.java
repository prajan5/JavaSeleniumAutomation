package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		
		/*The product of that number with every whole number less than or equal to 'n' 
		till 1. For example, the factorial of 4 is 4 × 3 × 2 × 1, which is equal to 24.*/
		int num = 5;
		int factorial= 1;
		for(int i=1;i<=num;i++)
		{
			factorial = factorial *i; //1*1=1, 1*2 = 2; 2*3=6;6*4=24;24*5
		}
		System.out.println(factorial);
		
		
		

	}

}
