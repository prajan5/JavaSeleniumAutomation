package alertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		//Instantiate Browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//add Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				//Load URL
				driver.get("https://leafground.com/alert.xhtml");
				driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
				//syntax for Alert
				Alert alert = driver.switchTo().alert();
				//get text from the alert 
				String sText = alert.getText();
				System.out.println(sText);
				//dismiss the alert
				alert.dismiss();
				//display the message displayed after accepting alert 
				String msg = driver.findElement(By.id("result")).getText();
				System.out.println(msg);
				driver.close();

	}

}
