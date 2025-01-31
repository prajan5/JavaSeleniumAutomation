package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		//Login to the LeapTaps app
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Create Account
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.id("accountName")).sendKeys("Sm");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("2");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("Lf");
				
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		if (title.contains("Account Details | opentaps CRM"))
		{
			System.out.println("title is displayed correctly: "+title);
			
		}
		else
		{
			System.out.println("title is not displayed correctly");
			
		}
		//close the browser
		//driver.close();
		
	}

}
