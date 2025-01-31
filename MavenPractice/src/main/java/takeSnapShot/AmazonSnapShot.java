package takeSnapShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSnapShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize();
		//Login to the LeapTaps app
		driver.get("https://www.amazon.in");
		
		//step1 ->take snap
		File ss = driver.getScreenshotAs(OutputType.FILE);
		//step2 - set path where to store shot
		File des = new File("./snapshot/Amznhome.png");
		//step3 Combine step1 and step2
		FileUtils.copyFile(ss, des);
		
		
		
		

	}

}
