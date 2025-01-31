package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandling {

	public static void main(String[] args) {
		//Instantiate Browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//add Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				//Load URL
				driver.get("https://leafground.com/frame.xhtml");
				driver.switchTo().frame(0);
				driver.findElement(By.id("Click")).click();

	}

}
