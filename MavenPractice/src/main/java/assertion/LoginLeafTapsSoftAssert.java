package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginLeafTapsSoftAssert {
	
	
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
		String expTitle = "Leaftaps - TestLea Automation Platform";
		String actTitle = driver.getTitle();
		//SoftAssert- if it fails, subsequent steps will get executed
		//object to be created
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actTitle, expTitle);
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//System.out.println(driver.getCurrentUrl());
		//close the browser
	    driver.close();
	    //should be at the last line 
	    sa.assertAll();
		
	}

}
