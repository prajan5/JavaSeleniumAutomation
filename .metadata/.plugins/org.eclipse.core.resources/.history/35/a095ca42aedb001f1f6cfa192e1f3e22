package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public LoginPage enterUserName(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
		//m1
		//LoginPage lp = new LoginPage();
		//return lp;
		
		//m2
		
		return this;
	}
	
	public LoginPage enterPassword(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}

	
	public HomePage clickOnLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//m1
			//HomePage hp = new HomePage();
			//return hp;
		//m2
		return new HomePage(driver);
	}


}
