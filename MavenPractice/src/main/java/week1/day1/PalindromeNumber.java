package week1.day1;

public class PalindromeNumber {

	public static void main(String[] args) {
	int origNum = 2332;
	int revNum = 0;
	int temp = origNum;
	int remainder =0;
	
	while(origNum>0)
	{
		remainder = origNum%10;
		revNum = revNum*10+remainder;
		System.out.println(revNum);
		origNum=origNum/10;
		//System.out.println(origNum);
		
	}
	
	if (temp==revNum)
	 {
		System.out.println("Palindrome");
					
	 }
	else
	{
		System.out.println("it is not Palindrome");
		

     }
	
	}}