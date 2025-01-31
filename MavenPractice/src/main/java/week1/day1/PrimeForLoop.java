package week1.day1;

public class PrimeForLoop {

	public static void main(String[] args) {
		int n = 0;
		int i;
		boolean b  =true;
		
		 // 0 and 1 are not prime numbers
	    if (n == 0 || n == 1) {
	        b = false;
	    }
	    for (i=2;i<=n;i++)
		{
	
		  
			if(n%2==0)
			{
				b=false;
				break;
			}
			
		
			
		
			
		}
		if(b==true )
			
			System.out.println(n+ " is  a prime number");
		
		else
		
			System.out.println(n+ " is not a prime number");
				

	}}


