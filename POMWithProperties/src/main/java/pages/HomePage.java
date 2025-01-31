package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	

	public HomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public MyHomePage clickOnCrmsfa()
	{
	//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage(driver);

	}

	
	
	public LoginPage clickOnLogOut()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
