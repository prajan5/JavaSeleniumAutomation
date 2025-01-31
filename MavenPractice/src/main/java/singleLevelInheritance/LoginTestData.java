package singleLevelInheritance;

public class LoginTestData extends TestData {
	
	
	void enterUsername()
	 {
		 System.out.println("enterUsername from Sub class");
	 }
	
	void  enterPassword()
	{
	System.out.println("enterPassword from Sub class");
	}


	public static void main(String[] args) 
	{
		LoginTestData ld = new LoginTestData();
		ld.enterCredentials();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
		
		

	}

}
