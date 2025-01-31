package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		//Instantiate Browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//Load URL
		driver.get("https://leafground.com/frame.xhtml");
		
		//switch to outer frame ie frame1
		driver.switchTo().frame(2);
		
		//switch to inner frame 
		driver.switchTo().frame("frame2");
		
		//click button insider the frame 
		driver.findElement(By.id("Click")).click();
		
		
		//switch to parent frame (previous frame) from the current frame
		driver.switchTo().parentFrame();
		
		//switch back to main page
		driver.switchTo().defaultContent();

	}

}
