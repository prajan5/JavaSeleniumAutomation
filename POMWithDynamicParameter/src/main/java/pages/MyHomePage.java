package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {
	
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}

	
	public CreateLeadPage clickOnLeads()
	{
		//Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				return new CreateLeadPage();
	}
	
	
	public void clickOnContacts()
	{
		//Click on the "Contacts" tab.
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	public MyAccountPage clickOnAccounts()
	{
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}
	
	
}
