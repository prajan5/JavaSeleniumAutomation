package notification;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationHandling {

	public static void main(String[] args) {
		
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disable-notifications");
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
		//Load URL
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
