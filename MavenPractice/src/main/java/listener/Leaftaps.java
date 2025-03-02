package listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Leaftaps {
	//public static ChromeDriver driver; parallel execution will not happen with static keyword with common reference
		public ChromeDriver driver;
		
		@BeforeTest
		public void preCondition() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//enter user name and password
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
	@Test
	public void runcreate_Lead() {
	
		//Create Lead
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstNam")).sendKeys("Fname");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lname");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Devv");
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		
}
	@Test
	public void Edit_lead() throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
	}
	
}




//*[RemoteTestNG] detected TestNG version 7.4.0
//===============================================
//Suite
//Total tests run: 4, Passes: 1, Failures: 1, Skips: 0, Retries: 2
//=============================================== 