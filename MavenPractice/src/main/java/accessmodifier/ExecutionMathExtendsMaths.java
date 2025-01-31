package accessmodifier;

import week1.day2.Maths;

//inhertiance concept
public class ExecutionMathExtendsMaths extends Maths {

	public static void main(String[] args) {
		Maths em = new Maths();
		
		//only public method is accessible
		int a = em.add(20,30);
		System.out.println(a);
		
	
		
		ExecutionMathExtendsMaths em1 = new ExecutionMathExtendsMaths();
		em1.Multiply(a, a);
		
	
		
		
		
		
		
	
		
		
	

	}

}
