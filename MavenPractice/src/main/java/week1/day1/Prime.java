package week1.day1;

public class Prime {

	public static void main(String[] args) {
		int n = 11;
		int i=2;
		boolean b  =true;
		
		 // 0 and 1 are not prime numbers
	    if (n == 0 || n == 1) {
	        b = false;
	    }
	        
		while(i<n/2)
		{
	
		  
			if(n%2==0)
			{
				b=false;
				break;
			}
			
		
			
		
			i++;
		}
		if(b==true )
			
			System.out.println(n+ " is  a prime number");
		
		else
		
			System.out.println(n+ "is not a prime number");
				

	}}


