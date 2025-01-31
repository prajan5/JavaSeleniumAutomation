package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingGetTitle {

	public static void main(String[] args) {
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://leafground.com/window.xhtml");
		//click open multiple windows button
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		//getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		//Set title of the window which to handle 
		String sTitle = "Dashboard";
		for (String s: allWindows)
		{
			driver.switchTo().window(s);
			if (driver.getTitle().contains(sTitle))
			{
				System.out.println(driver.getCurrentUrl());
				driver.manage().window().maximize();
				driver.close();
				
			}
		}
		//switch to main window. since set is not converted to List. using defaultcontent
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());

	}
	
	/*[904A3C671CEF71EE87F05B8EA18B417D, E64A67B00EC536607D089A6076AC60A8, 58FD1BBAD200B48BEF2F24C6B48B9DEE]
https://leafground.com/dashboard.xhtml
https://leafground.com/table.xhtml*/

}
