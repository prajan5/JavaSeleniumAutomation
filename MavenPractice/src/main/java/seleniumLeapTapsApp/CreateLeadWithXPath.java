package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithXPath {

	public static void main(String[] args) {
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
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("FNamee");
		//Enter a LastName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Lname");
		//Enter a CompanyName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Devv");
		
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Leadd");
		
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Devv");
	
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description of Lead");
		
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Email@testLeaf.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement  dpstate = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select optstate = new Select(dpstate);
		optstate.selectByContainsVisibleText("New York");
		
						
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		

		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important notes");
		
		//Click on the update button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Get the Title of the Resulting Page.
		System.out.println(driver.getTitle());
		
		
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]
		//Close the browser
		//driver.close();


	}

}
