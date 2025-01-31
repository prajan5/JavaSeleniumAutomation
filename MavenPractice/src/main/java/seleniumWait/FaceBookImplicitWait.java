package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookImplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		

		//Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("FName");
		//Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("LName");
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("7998799999");
		//Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		//Handle all three dropdowns in Date of birth
		
		WebElement dpday = driver.findElement(By.id("day"));
		Select optday = new Select(dpday);
		optday.selectByVisibleText("1");
		
		WebElement dpmonth = driver.findElement(By.id("month"));
		Select optmonth = new Select(dpmonth);
		optmonth.selectByValue("2");
		
		WebElement dpyear= driver.findElement(By.id("year"));
		Select optyear= new Select(dpyear);
		optyear.selectByIndex(5);
		
		//Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		

	}

}
