package testNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
	driver = new ChromeDriver();
	//maximize the browser 
	driver.manage().window().maximize();
	//Login to the LeapTaps app
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	//Click on the "CRM/SFA" link.
	driver.findElement(By.linkText("CRM/SFA")).click();
	}

	
	@AfterMethod
	public void postcondition()
	{
	//Close the browser
	driver.close();
	}


}
