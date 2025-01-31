package windowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://leafground.com/window.xhtml");
		//click on open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//getWindowHandle - address of parent window
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		System.out.println(driver.getTitle());
		
		//getWindowHandles - address of all the opened browser windows
			Set<String> allwindows = driver.getWindowHandles();
			System.out.println(allwindows);
		//Convert Set to List for get method to get the child window 
			List<String> listWindows = new ArrayList<String>(allwindows);
		//Switch to child window
			driver.switchTo().window(listWindows.get(1));
		//print the title of child window 
			System.out.println(driver.getTitle());
		//Type email address
			driver.findElement(By.id("email")).sendKeys("Nirmala@leaf.com");
		//close child window
			driver.close();
		//switch to parent window
			driver.switchTo().window(listWindows.get(0));
		//click open multiple windows button
			driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
			
		////getWindowHandles - address of all the opened browser windows
			Set<String> againAllWindows = driver.getWindowHandles();
			System.out.println(againAllWindows);
	}

/*E4F42C3ABB97669F4530996DE5C3EFCB
Window
[E4F42C3ABB97669F4530996DE5C3EFCB, C4770A67DF07A3C3AD117BEA6D961502]
Dashboard
[E4F42C3ABB97669F4530996DE5C3EFCB, 46DA05A1940E5B83A4D5223904BB34AA, 2906593EAFFA0569E8BD4F5A7F2046EA]
*/
	
}
