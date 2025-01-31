package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class AccountPage_TC002 extends ProjectSpecificMethod {

	@Test
	public void login()
	{
	//create object for LoginPage
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver);
		
		//method level chaining
		lp.enterUserName()
		.enterPassword()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnAccounts();
		
	
	}
		
		
		
}
