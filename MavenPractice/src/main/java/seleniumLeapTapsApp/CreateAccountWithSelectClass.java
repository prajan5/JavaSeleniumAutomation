package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

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
		driver.findElement(By.id("accountName")).sendKeys("SS");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("22");
		//Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LL");
		
		
		//Select "ComputerSoftware" as the industry.
		WebElement dpCompSoft = driver.findElement(By.name("industryEnumId"));
		Select optCompSoft = new Select(dpCompSoft);
		optCompSoft.selectByVisibleText("Computer Software");
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement dpSCorp = driver.findElement(By.name("ownershipEnumId"));
		Select optSCorp = new Select(dpSCorp);
		optSCorp.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue.
		
		WebElement dpSource = driver.findElement(By.id("dataSourceId"));
		Select optSource = new Select(dpSource);
		optSource.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		
		WebElement dpMktCam = driver.findElement(By.id("marketingCampaignId"));
		Select optMktCam = new Select(dpMktCam);
		optMktCam.selectByIndex(5);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement dpStateProvince= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select optStateProvince = new Select(dpStateProvince);
		optStateProvince.selectByValue("TX");
		
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
		driver.close();
		
	}

}
