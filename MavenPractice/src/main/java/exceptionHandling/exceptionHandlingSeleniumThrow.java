package exceptionHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class exceptionHandlingSeleniumThrow {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	try {
		driver.findElement(By.id("Username")).sendKeys("DemoSalesManager");
	} catch (Exception e) {
		System.out.println(e);
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
	}
	
	try {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		driver.findElement(By.className("decorativeSubmit")).click();
	} catch (Exception e) {
		System.out.println(e);
		
	}
	
	

	}

}
