package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.IntegrationWithTCWithIndices;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	
	//public static ChromeDriver driver; parallel execution will not happen with static keyword with common reference
	public ChromeDriver driver;
	public String data;
	
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	
	
	@DataProvider(name="getData")//,indices = {0}
	public String[][] setValue() throws IOException{
			//classname.methodname and return the value 
		return utils.IntegrationWithTCWithIndices.readExcel(data);
				
}
}
