package seleniumLeapTapsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadDropdown {

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
		//Create Lead
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FFF");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LLL");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DDD");
				//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LLL");
		
		//select source
		WebElement dpsource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select optSource = new Select(dpsource);
		optSource.selectByIndex(5);
		
		//select Market Campaign
		WebElement dpMktCampaign= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select optMkt = new Select(dpMktCampaign);
		optMkt.selectByVisibleText("Automobile");
		
		//Select Preferred currency
		WebElement dpPreCurrency= driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select optPreCurr = new Select(dpPreCurrency);
		optPreCurr.selectByValue("KPW");
		
		
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();

	}

}
