package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		//Login to the LeapTaps app
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Elder sibling to younger sibling
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		//Elder cousin to Younger cousin
		driver.findElement(By.xpath("//input[@id='username']/following::input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Create Lead
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	
		//select the first lead id
		String leadid = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tbody/tr//td[1]")).getAccessibleName();
		
		System.out.println(leadid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Click on the delete button.
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		Thread.sleep(2000);
		
		String smessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		if (smessage =="No records to display")
		{
			System.out.println(smessage+"displayed correctly");
		}
		
		else
		{
			System.out.println("No records to display is not displayed");
		}
		
		
		
	
		
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]
		//Close the browser
		//driver.close();


	}

}
