package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public LoginPage enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys(p.getProperty("userName"));
		//m1
		//LoginPage lp = new LoginPage();
		//return lp;
		
		//m2
		
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
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
