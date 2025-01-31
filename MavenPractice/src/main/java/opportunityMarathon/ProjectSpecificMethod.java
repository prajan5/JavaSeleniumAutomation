package opportunityMarathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	public String FileName = "Opportunity";;
	public String SheetName;
	
	
	
	@DataProvider(name="getData",indices = {0})
	public  String[][] setValue() throws IOException {
		//Excel Integration Classname.methodname and return value
		return ExcelIntegration.readExcel(FileName,SheetName);
		
	}
		
	//order can be anything but same variables from xml to be used 
	@Parameters({"url","username","password"})
	@BeforeMethod()
	public void precondition(String Url ,String Username , String Password)
	{		
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys(Username);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.id("Login")).click();

			//Click view App launcher and click	
			WebElement applauncher = driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-context-bar__button slds-icon-waffle')]"));
					
					//Perform Action
					Actions obj2 = new Actions(driver);
					obj2.moveToElement(applauncher).perform();
					applauncher.click();
			//Click on "View All" and select "Sales" from the App Launcher.	
			driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
			driver.findElement(By.xpath("//span/p[text()='Sales']")).click();
		
	}
	
	@AfterMethod()
	public void postcondition()
	{		
		driver.close();
		System.out.println("Closed the browser");
		
		
	}

	}


