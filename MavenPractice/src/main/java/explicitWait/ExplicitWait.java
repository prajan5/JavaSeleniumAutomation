package explicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate Browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//add Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
				//Load URL
				driver.get("https://leafground.com/waits.xhtml");
				////click "Click" button
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				
				 //WebElement vis =driver.findElement(By.xpath("//span[text()='I am here']"));
				//driver.findElement(By.xpath("(//button[@type='submit']//span)[2]")).click();
				
				WebElement vis = driver.findElement(By.xpath("(//button[@type='submit']/span)[2]"));
				
				
				
				WebDriverWait wbwait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
				//condition
				WebElement untilcon = wbwait.until(ExpectedConditions.visibilityOf(vis));
				
				System.out.println(untilcon.getText());
				

	}

}
