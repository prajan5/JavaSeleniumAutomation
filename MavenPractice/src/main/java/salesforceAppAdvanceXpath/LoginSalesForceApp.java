package salesforceAppAdvanceXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesForceApp {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("Username");
		
		driver.findElement(By.xpath("//form[@id='login_form']/input[@id='password']")).sendKeys("Pass");
		
		driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		//div[@id='username_container']/input
		//form[@id='login_form']/input[@id='password']
		//div[@id='theloginform']//input[@id='Login']

	}

}
