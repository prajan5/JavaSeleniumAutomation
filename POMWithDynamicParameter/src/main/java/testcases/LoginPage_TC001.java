package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginPage_TC001 extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setValues()
	{
		data="LoginPage";
	}
@Test(dataProvider = "getData")
public void login(String userName, String password)
{
	//create object for LoginPage
	LoginPage lp = new LoginPage(driver);
	System.out.println(driver);
	//method level chaining
	lp.enterUserName(userName)
	.enterPassword(password)
	.clickOnLoginButton()
	.clickOnCrmsfa()
	.clickOnLeads();

	
	
	}



}
