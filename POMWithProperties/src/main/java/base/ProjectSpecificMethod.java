package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	
	//public static ChromeDriver driver; parallel execution will not happen with static keyword with common reference
	public ChromeDriver driver;
	public static Properties p;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() throws IOException   {
	 //For Multilingual purpose
	 //set path for the properties file 
	 //FileInputStream f = new FileInputStream("src/main/resources/"+fileName+".properties");
		FileInputStream f = new FileInputStream("src/main/resources/English.properties");
	 //create object for properties class 
		p = new Properties();
		p.load(f);
	 //read the value from property file
		String sname = p.getProperty("userName");
		System.out.println(sname);
		String spassword = p.getProperty("password");
		System.out.println(spassword);
		//driver instantiation
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
