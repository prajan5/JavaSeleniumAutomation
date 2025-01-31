package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingGetTitle2 {

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
		for (String s: allWindows)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
				
				
			}
		}
		

	}
	
/*[42BA223B2D27B9FC9F10CE7293FB1385, CE8F622C6D8D34D56BD00A70729314B3, 9E7DAEECA7DBF336C1C168A4DC237922]
		https://leafground.com/window.xhtml;jsessionid=node0vtxo48wx3ymq15f1nqtqk65s98226022.node0
			Window
			https://leafground.com/dashboard.xhtml
			Dashboard
			https://leafground.com/table.xhtml
			Web Table
*/
