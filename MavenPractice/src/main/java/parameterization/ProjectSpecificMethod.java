package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	
	//order does not matter between annotation and staticparaeterization.xml
		@Parameters({"password","url","username","browser"})
		
		@BeforeMethod
		//seq is mater from @Parameters
		public void precondition(String password,String url, String uname,String browser){

	
		switch(browser)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("no vlaue");;
			break;
		}
		
		//maximize the browser 
		driver.manage().window().maximize();
		//Login to the LeapTaps app
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
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
