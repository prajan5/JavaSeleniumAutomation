package exceptionHandling;

public class ExceptonHandling {

	public static void main(String[] args) {
		int value[] = {3,6,8,4,9};
		//if there are more than one validation in try block first statement will be executed 
		try {
			System.out.println(value[1/0]);// this statement will be executed System.out.println(value[6]);
			System.out.println(value[6]);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program is successful");

	}

}
