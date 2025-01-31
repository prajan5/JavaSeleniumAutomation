package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLeafTaps {
	
	
	@Test
	public void login() throws InterruptedException{
		/*Chrome driver is a class  from Maven dependencies. creating object to access methods in class.
		 *  empty browser launch. chrome driver should have installed. */
		 
		//Everytime launches new browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter user name and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		Thread.sleep(3000);//3 milli seconds
		
		//get the title of the page
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String actTitle = driver.getTitle();
		//Hard Assertion- if it fails, subsequent steps will not get executed
		Assert.assertEquals(actTitle, expTitle);
				
		//Click CRM/SFA
		//driver.findElement(By.linkText("CRM/SFA")).click();
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		//Assert.assertTrue(displayed);//Expected to display CRM/SFA link
		//Expected Not to display CRM/SFA link, Subsequent steps will not execute
		Assert.assertFalse(displayed);
		
		
			
		//System.out.println(driver.getCurrentUrl());
		//close the browser
	    driver.close();
		
	}

}
