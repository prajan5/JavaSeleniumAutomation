package week1.day2;

public class ExecutionMaths {

	public static void main(String[] args) {
		Maths em = new Maths();
	
		//public method from maths class
		System.out.println(em.add(20,30));
		
		//protected method 
		em.Multiply(5, 5);
					
		//default method
		int divide = em.divide(10, 2);//ctrl+2 Assign to local variable
		System.out.println(divide);
		

	}

}
