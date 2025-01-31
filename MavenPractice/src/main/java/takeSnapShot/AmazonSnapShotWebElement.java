package takeSnapShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSnapShotWebElement {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		//Login to the LeapTaps app
		driver.get("https://www.amazon.in");
		WebElement wb = driver.findElement(By.id("nav-global-location-popover-link"));
		
		//step1 ->take snap
		File ss = wb.getScreenshotAs(OutputType.FILE);
		//step2 - set path where to store shot
		File des = new File("./snapshot/location.png");
		//step3 Combine step1 and step2
		FileUtils.copyFile(ss, des);
		
		
		
		

	}

}
