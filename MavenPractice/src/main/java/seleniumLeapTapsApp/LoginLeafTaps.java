package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeafTaps {

	public static void main(String[] args) throws InterruptedException {
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
		//System.out.println(driver.getTitle());//Leaftaps - TestLeaf Automation Platform
		String title = driver.getTitle();
		if (title.contains("Leaftaps"))
		{
			System.out.println("Login Successful");
			
		}
		else
			System.out.println("Login is not Successful");
		
		//Click CRM/SFA
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
			
		System.out.println(driver.getCurrentUrl());
		//close the browser
		//driver.close();
		
	}

}
