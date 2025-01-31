package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(1/0);
			
		} catch (ArithmeticException a) {
			System.out.println(a);
			System.out.println(10/5);
		}
		catch (Exception e) {
			System.out.println(e);
		}
			
			System.out.println("Program is successful");
			
		try {
				System.out.println(10/2); //will not go to catch,as there is no exception
				
			} catch (ArithmeticException a) {
				System.out.println(a);
				System.out.println(10/5);
			}
			catch (Exception w) { // 
				System.out.println(w);
		
			}finally {
				System.out.println("final block regardless of exception");
			}
		System.out.println("Program is successful");
				
	}}

	
	



